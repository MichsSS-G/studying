package studyingExceptions;

import java.util.Scanner;

public class SqrtCalculator {

    public static double sqrt(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Expected non-negative number, got " + Double.toString(x));
        }
        return Math.sqrt(x);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(sqrt(scanner.nextDouble()));
        scanner.close();
    }
}
