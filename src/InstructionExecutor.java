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

        System.out.println("ADD START");
        state.registers[rd] = state.registers[rs] + state.registers[rt];
        System.out.println("OP 1: " + state.registers[rs]);
        System.out.println("OP 2: " + state.registers[rt]);
        System.out.println("RESULT : " + state.registers[rd]);
    }

    private static void executeSub(MIPSState state, int instruction) {
        int rs = (instruction >> 21) & 0x1F;
        int rt = (instruction >> 16) & 0x1F;
        int rd = (instruction >> 11) & 0x1F;

        System.out.println("SUB START");
        state.registers[rd] = state.registers[rs] - state.registers[rt];
        System.out.println("OP 1: " + state.registers[rs]);
        System.out.println("OP 2: " + state.registers[rt]);
        System.out.println("RESULT : " + state.registers[rd]);
    }

    private static void executeAnd(MIPSState state, int instruction) {
        int rs = (instruction >> 21) & 0x1F;
        int rt = (instruction >> 16) & 0x1F;
        int rd = (instruction >> 11) & 0x1F;

        System.out.println("AND START");
        state.registers[rd] = state.registers[rs] & state.registers[rt];
        System.out.println("OP 1: " + state.registers[rs]);
        System.out.println("OP 2: " + state.registers[rt]);
        System.out.println("RESULT : " + state.registers[rd]);
    }

    private static void executeOr(MIPSState state, int instruction) {
        int rs = (instruction >> 21) & 0x1F;
        int rt = (instruction >> 16) & 0x1F;
        int rd = (instruction >> 11) & 0x1F;

        System.out.println("OR START");
        state.registers[rd] = state.registers[rs] | state.registers[rt];
        System.out.println("OP 1: " + state.registers[rs]);
        System.out.println("OP 2: " + state.registers[rt]);
        System.out.println("RESULT : " + state.registers[rd]);
    }

    private static void executeSlt(MIPSState state, int instruction) {
        int rs = (instruction >> 21) & 0x1F;
        int rt = (instruction >> 16) & 0x1F;
        int rd = (instruction >> 11) & 0x1F;

        System.out.println("SLT START");
        state.registers[rd] = (state.registers[rs] < state.registers[rt]) ? 1 : 0;
        System.out.println("OP 1: " + state.registers[rs]);
        System.out.println("OP 2: " + state.registers[rt]);
        System.out.println("RESULT : " + state.registers[rd]);
    }

    private static void executeSyscall(MIPSState state) {
        int v0 = state.registers[2];

        System.out.println("SYSCALL START");
        switch (v0) {
            case 1 -> {
                System.out.println("$v0 = 1 -> PRINT INTEGER");
                System.out.println(state.registers[4]);
            }
            case 4 -> {
                System.out.println("$v0 = 4 -> PRINT STRING");
                int address = state.registers[4];
                StringBuilder sb = new StringBuilder();
                while (true) {
                    Integer word = state.dataMemory.get(address);
                    char[] bytes = new char[4];
                    if (word == null) break;

                    for (int i = 0; i < 4; i++) {
                        int byteVal = (word >> (8 * (3 - i))) & 0xFF;
                        // sb.append((char) byteVal);
                        bytes[i] = (char) byteVal;
                    }

                    for (int i = 3; i >= 0; i--) {
                        sb.append(bytes[i]);
                    }

                    address += 4;
                }
                System.out.println(sb);
            }
            case 5 -> {
                System.out.println("$v0 = 5 -> READ INTEGER");
                Scanner in = new Scanner(System.in);
                try {
                    int input = in.nextInt();
                    state.registers[2] = input;
                    System.out.println("GATHERED INTEGER: " + state.registers[2]);
                } catch (Exception e) {
                    System.err.println("Invalid integer input.");
                    state.registers[2] = 0;
                    in.nextLine();
                    System.exit(1);
                }
            }
            case 10 -> {
                System.out.println("$v0 = 10 -> TERMINATE EXECUTION");
                System.out.println("-- program is finished running --");
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

        if (state.registers[rs] == state.registers[rt]) {
            state.pcAddress += offset;
        }
    }

    private static void executeBne(MIPSState state, int instruction) {
        int rs = (instruction >> 21) & 0x1F;
        int rt = (instruction >> 16) & 0x1F;
        int offset = instruction & 0xFFFF;
        offset = signExtend(offset) << 2;

        if (state.registers[rs] != state.registers[rt]) {
            state.pcAddress += offset;
        }
    }

    private static void executeAddiu(MIPSState state, int instruction) {
        int rs = (instruction >> 21) & 0x1F;
        int rt = (instruction >> 16) & 0x1F;
        int immediate = signExtend(instruction & 0xFFFF);

        System.out.println("ADDIU START");
        state.registers[rt] = state.registers[rs] + immediate;
        System.out.println("RT: " + state.registers[rt]);
    }

    private static void executeAndi(MIPSState state, int instruction) {
        int rs = (instruction >> 21) & 0x1F;
        int rt = (instruction >> 16) & 0x1F;
        int immediate = instruction & 0xFFFF;

        System.out.println("ANDI START");
        state.registers[rt] = state.registers[rs] & immediate;
        System.out.println("OP 1: " + state.registers[rs]);
        System.out.println("IMM: " + immediate);
        System.out.println("RESULT : " + state.registers[rt]);
    }

    private static void executeOri(MIPSState state, int instruction) {
        int rs = (instruction >> 21) & 0x1F;
        int rt = (instruction >> 16) & 0x1F;
        int immediate = instruction & 0xFFFF;

        System.out.println("ORI START");
        state.registers[rt] = state.registers[rs] | immediate;
        System.out.println("OP 1: " + state.registers[rs]);
        System.out.println("IMM: " + immediate);
        System.out.println("RESULT : " + state.registers[rt]);
    }

    private static void executeLui(MIPSState state, int instruction) {
        int rt = (instruction >> 16) & 0x1F;
        int immediate = instruction & 0xFFFF;

        System.out.println("LUI START");
        state.registers[rt] = immediate << 16;
        System.out.println("RT: " + state.registers[rt]);
    }

    private static void executeLw(MIPSState state, int instruction) {
        int rs = (instruction >> 21) & 0x1F;
        int rt = (instruction >> 16) & 0x1F;
        int offset = signExtend(instruction & 0xFFFF);

        System.out.println("LW START");
        int address = state.registers[rs] + offset;
        Integer value = state.dataMemory.get(address);
        state.registers[rt] = (value != null) ? value : 0;
        System.out.println("RT: " + state.registers[rt]);
    }

    private static void executeSw(MIPSState state, int instruction) {
        int rs = (instruction >> 21) & 0x1F;
        int rt = (instruction >> 16) & 0x1F;
        int offset = signExtend(instruction & 0xFFFF);

        System.out.println("SW START");
        int address = state.registers[rs] + offset;
        state.dataMemory.put(address, state.registers[rt]);
        System.out.println("DATA: " + state.dataMemory.get(address));
    }

    // === J-Type Handler ===

    private static void executeJump(MIPSState state, int instruction) {
        int address = instruction & 0x3FFFFFF;
        state.pcAddress = (state.pcAddress & 0xF0000000) | (address << 2);
    }

    // === Helper method ===

    private static int signExtend(int value) {
        if ((value & 0x8000) != 0) {
            return value | 0xFFFF0000;
        }
        return value;
    }
}
