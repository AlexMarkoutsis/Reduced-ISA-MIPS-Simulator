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

        // Initialize memory, registers, and PC
        MIPSState state = new MIPSState();

        try {
            MemoryLoader.loadText(state, textFile);
            MemoryLoader.loadData(state, dataFile);

            runProgram(state);

        } catch (IOException e) {
            System.err.println("Error loading files: " + e.getMessage());
        }
    }


    private static void runProgram(MIPSState state) {
        while (true) {
            // Used for beq/bne
            int oldPC = state.pcAddress;

            // ** FETCH INSTRUCTION **
            Integer instruction = state.textMemory.get(state.pcAddress);

            // Exit with error
            if (instruction == null || instruction == 0x00000000) {
                System.out.println("\n-- program is finished running (dropped off bottom) --");
                break;
            }

            // ** EXECUTE INSTRUCTION **
            InstructionExecutor.execute(state, instruction);

            // Only auto-increment if branch not taken
            if (state.pcAddress == oldPC)
                state.pcAddress += 4;
        }
    }
}