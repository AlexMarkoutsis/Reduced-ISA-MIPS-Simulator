/*********************************************************************
 * Authors: Alex Markoutsis, Nathan Stout
 * Created: March 26, 2025

 * This program simulates the process of decoding MIPS machine code
 * instructions into their corresponding assembly language mnemonics.
 * The program accepts a single hexadecimal input representing a
 * 32-bit MIPS instruction, determines its type (R-type, I-type, J-type,
 * or syscall), and decodes its components (e.g., opcode, registers,
 * immediate values, or addresses).

 * Coding assignment 2 for UWM COMPSCI 458.
 **********************************************************************/

import java.io.IOException;
import java.util.*;

public class MIPSSimulator {

    static List<String> opcodeMap = Arrays.asList(new String[64]);
    static List<String> functMap = Arrays.asList(new String[64]);

    static {
        // I-Type instructions
        opcodeMap.set(4, "beq");
        opcodeMap.set(5, "bne");
        opcodeMap.set(9, "addiu");
        opcodeMap.set(12, "andi");
        opcodeMap.set(13, "ori");
        opcodeMap.set(15, "lui");
        opcodeMap.set(35, "lw");
        opcodeMap.set(43, "sw");

        // J-Type instructions
        opcodeMap.set(2, "j");

        // R-Type instructions
        functMap.set(12, "syscall");
        functMap.set(32, "add");
        functMap.set(34, "sub");
        functMap.set(36, "and");
        functMap.set(37, "or");
        functMap.set(42, "slt");
    }


    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java MIPSSimulator <text file> <data file>");
            return;
        }

        String textFile = args[0];
        String dataFile = args[1];

        MIPSState state = new MIPSState();

        try {
            MemoryLoader.loadText(state, textFile);
            MemoryLoader.loadData(state, dataFile);

            System.out.println("Memory loaded successfully!");
            // loop here (fetch-decode-execute)
        } catch (IOException e) {
            System.err.println("Error loading files: " + e.getMessage());
        }
    }


    /**
     * Main decoding method
     * Delegates work to specific helper methods
     * @param instruction 32-bit machine code instruction
     * @return Formatted assembly instruction with components
     */
    public static String decodeInstruction(int instruction) {

        int opcode = (instruction >> 26) & 0x3F;  // Mask 6 bits -> 0b111111

        String type = determineInstructionType(instruction, opcode);

        return switch (type) {
            case "rType" ->     decodeRType(instruction);
            case "iType" ->     decodeIType(instruction);
            case "syscall" ->   decodeSyscall(instruction);
            case "j" ->         decodeJType(instruction);
            default ->          throw new IllegalArgumentException("Unsupported instruction: " + opcode);
        };
    }


    /**
     * Determines instruction type from opcode and
     * funct code, if the instruction is an r-type
     * @param instruction Full 32-bit instruction
     * @param opcode 6-bit opcode field
     * @return Instruction type classification
     */
    private static String determineInstructionType(int instruction, int opcode) {

        // r-type or syscall
        if (opcode == 0) {
            int funct = instruction & 0x3F;  // Mask 6 bits -> 0b111111
            String functName = functMap.get(funct);

            if (functName == null) {
                throw new IllegalArgumentException("Unknown function: " + funct);
            }
            return functName.equals ("syscall") ? "syscall" : "rType";

        // j-type
        } else if (opcode == 2) {
            return "j";

        // i-type
        } else if (opcodeMap.get(opcode) != null) {
            return "iType";

        // unsupported instruction
        } else {
            throw new IllegalArgumentException("opcode not found: " + opcode);
        }
    }


    /**
     * Decodes R-Type instructions (opcode 0)
     * Format: mnemonic {opcode: XX, rs: XX, rt: XX, rd: XX, shmt: XX, funct: XX}
     * @param instruction Full 32-bit instruction
     * @return Formatted instruction string
     */
    private static String decodeRType(int instruction) {
        int opcode = (instruction >> 26) & 0x3F;    // bits 31-26
        int rs = (instruction >> 21) & 0x1F;        // bits 25-21
        int rt = (instruction >> 16) & 0x1F;        // bits 20-16
        int rd = (instruction >> 11) & 0x1F;        // bits 15-11
        int shamt = (instruction >> 6) & 0x1F;      // bits 10-6
        int funct = instruction & 0x3F;             // bits 5-0

        String mnemonic = functMap.get(funct);
        return String.format("%s {opcode: %02x, rs: %02x, rt: %02x, rd: %02x, shmt: %02x, funct: %02x}",
                mnemonic, opcode, rs, rt, rd, shamt, funct);
    }


    /**
     * Decodes I-Type instructions
     * Format: mnemonic {opcode: XX, rs(base): XX, rt: XX, immediate(offset): XXXX}
     * @param instruction Full 32-bit instruction
     * @return Formatted instruction string
     */
    private static String decodeIType(int instruction) {
        int opcode = (instruction >> 26) & 0x3F;    // bits 31-26
        int rs = (instruction >> 21) & 0x1F;        // bits 25-21
        int rt = (instruction >> 16) & 0x1F;        // bits 20-16
        int immediate = instruction & 0xFFFF;       // bits 15-0

        String mnemonic = opcodeMap.get(opcode);
        return String.format("%s {opcode: %02x, rs(base): %02x, rt: %02x, immediate(offset): %04x}",
                mnemonic, opcode, rs, rt, immediate);
    }


    /**
     * Decodes J-Type instructions (opcode 2)
     * Format: mnemonic {opcode: XX, index: XXXXXXX}
     * @param instruction Full 32-bit instruction
     * @return Formatted instruction string
     */
    private static String decodeJType(int instruction) {
        int opcode = (instruction >> 26) & 0x3F;    // bits 31-26
        int address = instruction & 0x3FFFFFF;      // bits 25-0

        String mnemonic = opcodeMap.get(opcode);
        return String.format("%s {opcode: %02x, index: %07x}", mnemonic, opcode, address);
    }


    /**
     * Handles special syscall instruction
     * Format: mnemonic {opcode: XX, code: 000000, funct: XX}
     * @param instruction Full 32-bit instruction
     * @return Formatted syscall string
     */
    private static String decodeSyscall(int instruction) {
        int opcode = (instruction >> 26) & 0x3F;    // bits 31-6
        int funct = instruction & 0x3F;             // bits 5-0

        return String.format("syscall {opcode: %02x, code: 000000, funct: %02x}", opcode, funct);
    }
}