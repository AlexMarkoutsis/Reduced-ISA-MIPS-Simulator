import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MemoryLoader {

    public static void loadText(MIPSState state, String textFile) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(textFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty() || line.startsWith("#")) {
                    continue;
                }

                // Parse the instruction
                int instruction = Integer.parseInt(line.replaceFirst("0x", ""), 16);

                // Store into text memory
                state.textMemory.put(state.pcAddress, instruction);

                state.pcAddress += 4;
            }
        }
    }


    public static void loadData(MIPSState state, String dataFile) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(dataFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty() || line.startsWith("#")) {
                    continue;
                }

                // Parse the data value
                int dataValue = Integer.parseInt(line.replaceFirst("0x", ""), 16);

                // Store into data memory
                state.dataMemory.put(state.dataAddress, dataValue);

                state.dataAddress += 4;
            }
        }
    }

}
