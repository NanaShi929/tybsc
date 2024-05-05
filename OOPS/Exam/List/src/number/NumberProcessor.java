package number;

public class NumberProcessor {
    private double[] numbers;

    public NumberProcessor(double[] numbers) {
        this.numbers = numbers;
    }

    public double calculateSum() {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum;
    }

    public double calculateAverage() {
        if (numbers.length == 0) {
            return 0.0;
        }
        double sum = calculateSum();
        return sum / numbers.length;
    }

    public double[] getNumbers() {
        return numbers;
    }

    public void setNumbers(double[] numbers) {
        this.numbers = numbers;
    }
}
