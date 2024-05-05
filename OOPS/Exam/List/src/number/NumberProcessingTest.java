package number;

import number.FileNumberProcessor;
import number.NumberProcessor;

import java.io.IOException;

public class NumberProcessingTest {
    public static void main(String[] args) {
        String filePath = "myFile.txt";
        FileNumberProcessor fileProcessor = new FileNumberProcessor(filePath);

        try {
            double[] numbers = fileProcessor.readNumbersFromFile();
            NumberProcessor numberProcessor = new NumberProcessor(numbers);

            double sum = numberProcessor.calculateSum();
            double average = numberProcessor.calculateAverage();

            System.out.println("Numbers in the file: ");
            for (double num : numbers) {
                System.out.print(num + " ,");
            }
            System.out.println("\nSum: " + sum);
            System.out.println("Average: " + average);
        } catch (IOException e) {
            System.err.println("Error reading from the file: " + e.getMessage());
        }
    }
}
