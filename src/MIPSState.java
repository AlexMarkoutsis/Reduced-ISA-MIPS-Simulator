import java.util.HashMap;
import java.util.Map;

public class MIPSState {

    public int[] registers = new int[32];

    public Map<Integer, Integer> textMemory = new HashMap<>();  // instruction memory
    public Map<Integer, Byte> dataMemory = new HashMap<>();  // data memory (for lw/sw)

    public int pcAddress = 0x00400000;
    public int dataAddress = 0x10010000;

    public MIPSState() {
        // Initialize special registers
        registers[28] = 0x10008000;     // $gp (global pointer)
        registers[29] = 0x7fffeffc;     // $sp (stack pointer)
    }
}
