import java.util.HashMap;
import java.util.Map;

public class MIPSState {

    public int[] registers = new int[32];
    public static final String[] registerNames = {
            "$zero", "$at", "$v0", "$v1", "$a0", "$a1", "$a2", "$a3",
              "$t0", "$t1", "$t2", "$t3", "$t4", "$t5", "$t6", "$t7",
              "$s0", "$s1", "$s2", "$s3", "$s4", "$s5", "$s6", "$s7",
              "$t8", "$t9", "$k0", "$k1", "$gp", "$sp", "$fp", "$ra"
    };

    public Map<Integer, Integer> textMemory = new HashMap<>();  // instruction memory
    public Map<Integer, Integer> dataMemory = new HashMap<>();  // data memory (for lw/sw)

    public int pcAddress = 0x00400000;
    public int dataAddress = 0x10010000;

    public MIPSState() {
        // Initialize special registers
        registers[28] = 0x10008000;     // $gp (global pointer)
        registers[29] = 0x7fffeffc;     // $sp (stack pointer)
    }
}
