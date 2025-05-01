import java.util.Scanner;


public class InstructionExecutor {

    public static void execute(MIPSState state, int instruction) {

        int opcode = (instruction >> 26) & 0x3F;

        if (opcode == 0) {
            // R-Type Instruction
            int funct = instruction & 0x3F;
            switch (funct) {
                case 32 -> executeAdd(state, instruction);
                case 34 -> executeSub(state, instruction);
                case 36 -> executeAnd(state, instruction);
                case 37 -> executeOr(state, instruction);
                case 42 -> executeSlt(state, instruction);
                case 12 -> executeSyscall(state);  // syscall has special handling
                default -> throw new IllegalArgumentException("Unsupported R-type funct: " + funct);
            }

        } else {
            // I-Type or J-Type Instruction
            switch (opcode) {
                case  4 -> executeBeq(state, instruction);
                case  5 -> executeBne(state, instruction);
                case  9 -> executeAddiu(state, instruction);
                case 12 -> executeAndi(state, instruction);
                case 13 -> executeOri(state, instruction);
                case 15 -> executeLui(state, instruction);
                case 35 -> executeLw(state, instruction);
                case 43 -> executeSw(state, instruction);
                case  2 -> executeJump(state, instruction);
                default -> throw new IllegalArgumentException("Unsupported opcode: " + opcode);
            }
        }
    }

    // === R-Type Handlers ===

    private static void executeAdd(MIPSState state, int instruction) {

        int rs = (instruction >> 21) & 0x1F;
        int rt = (instruction >> 16) & 0x1F;
        int rd = (instruction >> 11) & 0x1F;

        state.registers[rd] = state.registers[rs] + state.registers[rt];
    }

    private static void executeSub(MIPSState state, int instruction) {

        int rs = (instruction >> 21) & 0x1F;
        int rt = (instruction >> 16) & 0x1F;
        int rd = (instruction >> 11) & 0x1F;

        state.registers[rd] = state.registers[rs] - state.registers[rt];
    }

    private static void executeAnd(MIPSState state, int instruction) {

        int rs = (instruction >> 21) & 0x1F;
        int rt = (instruction >> 16) & 0x1F;
        int rd = (instruction >> 11) & 0x1F;

        state.registers[rd] = state.registers[rs] & state.registers[rt];
    }

    private static void executeOr(MIPSState state, int instruction) {

        int rs = (instruction >> 21) & 0x1F;
        int rt = (instruction >> 16) & 0x1F;
        int rd = (instruction >> 11) & 0x1F;

        state.registers[rd] = state.registers[rs] | state.registers[rt];
    }

    private static void executeSlt(MIPSState state, int instruction) {

        int rs = (instruction >> 21) & 0x1F;
        int rt = (instruction >> 16) & 0x1F;
        int rd = (instruction >> 11) & 0x1F;

        state.registers[rd] = (state.registers[rs] < state.registers[rt]) ? 1 : 0;
    }

    private static void executeSyscall(MIPSState state) {

        int v0 = state.registers[2];

        switch (v0) {
            case 1 -> System.out.println(state.registers[4]);

            case 4 -> {
                int address = state.registers[4]; // $a0
                StringBuilder sb = new StringBuilder();

                int byteOffset = address % 4;
                int wordAddress = address - byteOffset;

                boolean done = false;
                while (!done) {
                    // Load the current 4-byte word
                    byte[] word = new byte[4];
                    for (int i = 0; i < 4; i++) {
                        Byte b = state.dataMemory.get(wordAddress + i);
                        word[i] = (b == null) ? 0 : b;
                    }

                    // Read bytes in reverse within the word
                    for (int i = 3 - byteOffset; i >= 0; i--) {
                        byte b = word[i];
                        if (b == 0) {
                            done = true;
                            break;
                        }
                        sb.append((char) (b & 0xFF));
                    }

                    // Move to next word
                    wordAddress += 4;
                    byteOffset = 0; // After first word, always start from byte 3
                }

                System.out.print(sb);
            }

            case 5 -> {
                Scanner in = new Scanner(System.in);
                try {
                    int input = in.nextInt();
                    state.registers[2] = input;
                } catch (Exception e) {
                    System.err.println("Invalid integer input.");
                    state.registers[2] = 0;
                    in.nextLine();
                    System.exit(1);
                }
            }

            case 10 -> {
                System.out.println("\n-- program is finished running --");
                System.exit(0);
            }

            default -> throw new UnsupportedOperationException("Unsupported syscall: " + v0);
        }
    }


    // === I-Type Handlers ===

    private static void executeBeq(MIPSState state, int instruction) {

        int rs = (instruction >> 21) & 0x1F;
        int rt = (instruction >> 16) & 0x1F;
        int offset = instruction & 0xFFFF;
        offset = signExtend(offset) << 2;

        if (state.registers[rs] == state.registers[rt])
            state.pcAddress += offset + 4;
    }



    private static void executeBne(MIPSState state, int instruction) {

        int rs = (instruction >> 21) & 0x1F;
        int rt = (instruction >> 16) & 0x1F;
        int offset = instruction & 0xFFFF;
        offset = signExtend(offset) << 2;

        if (state.registers[rs] != state.registers[rt])
            state.pcAddress += offset + 4;
    }

    private static void executeAddiu(MIPSState state, int instruction) {

        int rs = (instruction >> 21) & 0x1F;
        int rt = (instruction >> 16) & 0x1F;
        int immediate = signExtend(instruction & 0xFFFF);

        state.registers[rt] = state.registers[rs] + immediate;
    }

    private static void executeAndi(MIPSState state, int instruction) {

        int rs = (instruction >> 21) & 0x1F;
        int rt = (instruction >> 16) & 0x1F;
        int immediate = instruction & 0xFFFF;

        state.registers[rt] = state.registers[rs] & immediate;
    }

    private static void executeOri(MIPSState state, int instruction) {

        int rs = (instruction >> 21) & 0x1F;
        int rt = (instruction >> 16) & 0x1F;
        int immediate = instruction & 0xFFFF;

        state.registers[rt] = state.registers[rs] | immediate;
    }

    private static void executeLui(MIPSState state, int instruction) {

        int rt = (instruction >> 16) & 0x1F;
        int immediate = instruction & 0xFFFF;

        state.registers[rt] = immediate << 16;
    }

    private static void executeLw(MIPSState state, int instruction) {

        int rs = (instruction >> 21) & 0x1F;
        int rt = (instruction >> 16) & 0x1F;
        int offset = signExtend(instruction & 0xFFFF);

        int address = state.registers[rs] + offset;
        int word = 0;
        for (int i = 0; i < 4; i++) {
            Byte b = state.dataMemory.get(address + i);
            word = (word << 8) | ((b != null ? b & 0xFF : 0));
        }
        state.registers[rt] = word;
    }

    private static void executeSw(MIPSState state, int instruction) {

        int rs = (instruction >> 21) & 0x1F;
        int rt = (instruction >> 16) & 0x1F;
        int offset = signExtend(instruction & 0xFFFF);

        int address = state.registers[rs] + offset;
        int value = state.registers[rt];
        for (int i = 3; i >= 0; i--) {
            byte b = (byte) ((value >> (i * 8)) & 0xFF);
            state.dataMemory.put(address + (3 - i), b);
        }
    }

    // === J-Type Handler ===

    private static void executeJump(MIPSState state, int instruction) {

        int address = instruction & 0x3FFFFFF;
        state.pcAddress = (state.pcAddress & 0xF0000000) | (address << 2);
    }

    // === Helper method ===

    private static int signExtend(int value) {

        if ((value & 0x8000) != 0)
            return value | 0xFFFF0000;

        return value;
    }
}
