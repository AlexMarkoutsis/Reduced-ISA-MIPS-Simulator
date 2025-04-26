public class InstructionExecutor {

    public static void execute(int instruction, MIPSState state) {
        int opcode = (instruction >> 26) & 0x3F;

        if (opcode == 0) {
            // R-Type
            int funct = instruction & 0x3F;
            executeRType(funct, instruction, state);
        } else if (opcode == 2) {
            // J-Type (jump)
            executeJType(opcode, instruction, state);
        } else {
            // I-Type
            executeIType(opcode, instruction, state);
        }
    }

    private static void executeRType(int funct, int instruction, MIPSState state) {
        // extract fields
        int rs = (instruction >> 21) & 0x1F;
        int rt = (instruction >> 16) & 0x1F;
        int rd = (instruction >> 11) & 0x1F;
        int shamt = (instruction >> 6) & 0x1F;

        switch (funct) {
            case 32: // add
                state.registers[rd] = state.registers[rs] + state.registers[rt];
                break;
            case 34: // sub
                state.registers[rd] = state.registers[rs] - state.registers[rt];
                break;
            case 36: // and
                state.registers[rd] = state.registers[rs] & state.registers[rt];
                break;
            case 37: // or
                state.registers[rd] = state.registers[rs] | state.registers[rt];
                break;
            case 42: // slt
                state.registers[rd] = (state.registers[rs] < state.registers[rt]) ? 1 : 0;
                break;
            case 12: // syscall
                handleSyscall(state);
                break;
            default:
                throw new IllegalArgumentException("Unsupported R-type function: " + funct);
        }
    }

    private static void executeIType(int opcode, int instruction, MIPSState state) {
        int rs = (instruction >> 21) & 0x1F;
        int rt = (instruction >> 16) & 0x1F;
        int immediate = instruction & 0xFFFF;

        // sign-extend immediate if needed
        if ((immediate & 0x8000) != 0) {
            immediate |= 0xFFFF0000;
        }

        switch (opcode) {
            case 4: // beq
                if (state.registers[rs] == state.registers[rt]) {
                    state.pcAddress += immediate << 2; // branch offset is *4
                }
                break;
            case 5: // bne
                if (state.registers[rs] != state.registers[rt]) {
                    state.pcAddress += immediate << 2;
                }
                break;
            case 9: // addiu
                state.registers[rt] = state.registers[rs] + immediate;
                break;
            case 12: // andi
                state.registers[rt] = state.registers[rs] & (immediate & 0xFFFF);
                break;
            case 13: // ori
                state.registers[rt] = state.registers[rs] | (immediate & 0xFFFF);
                break;
            case 15: // lui
                state.registers[rt] = immediate << 16;
                break;
            case 35: // lw
                int address = state.registers[rs] + immediate;
                state.registers[rt] = state.dataMemory.getOrDefault(address, 0);
                break;
            case 43: // sw
                address = state.registers[rs] + immediate;
                state.dataMemory.put(address, state.registers[rt]);
                break;
            default:
                throw new IllegalArgumentException("Unsupported I-type opcode: " + opcode);
        }
    }

    private static void executeJType(int opcode, int instruction, MIPSState state) {
        int address = instruction & 0x03FFFFFF;
        address = (state.pcAddress & 0xF0000000) | (address << 2);
        state.pcAddress = address;
    }

    private static void handleSyscall(MIPSState state) {
        int v0 = state.registers[2]; // $v0
        switch (v0) {
            case 10: // Exit
                System.out.println("Syscall: Exit");
                System.exit(0);
                break;
            default:
                System.out.println("Unsupported syscall code: " + v0);
        }
    }
}
