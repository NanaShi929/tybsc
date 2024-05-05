import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumberProcessor {
    private double sum;
    private int count;
    private double average;

    public NumberProcessor() {
        sum = 0.0;
        count = 0;
        average = 0.0;
    }

    public void addNumber(int number) {
        sum += number;
        count++;
        average = sum / count;
    }

    public double getSum() {
        return sum;
    }

    public double getAverage() {
        return average;
    }
}


