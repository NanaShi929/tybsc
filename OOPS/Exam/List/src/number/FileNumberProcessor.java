package number;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileNumberProcessor {
    private String filePath;

    public FileNumberProcessor(String filePath) {
        this.filePath = filePath;
    }

    public double[] readNumbersFromFile() throws IOException {
        List<Double> numberList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                double number = Double.parseDouble(line);
                numberList.add(number);
            }
        }
        return numberList.stream().mapToDouble(Double::doubleValue).toArray();
    }
}
