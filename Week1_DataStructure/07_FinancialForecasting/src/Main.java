class FutureValueCalculator {
    public double calculateFutureValue(double presentValue, double growthRate, int periods) {
        if (periods == 0) {
            return presentValue;
        }
        return calculateFutureValue(presentValue, growthRate, periods - 1) * (1 + growthRate);
    }
}

public class Main {
    public static void main(String[] args) {
        FutureValueCalculator calc = new FutureValueCalculator();
        double result = calc.calculateFutureValue(1000, 0.05, 5);
        System.out.printf("Future Value after 5 years: %.2f\n", result);
    }
}
