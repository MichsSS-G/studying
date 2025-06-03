package sumOfDoubles;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double sum = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                if (scanner.hasNextDouble()) {
                    sum += scanner.nextDouble();
                }
                else {
                    scanner.next();
                }
            }
        }
        System.out.printf("%.6f", sum);
    }
}
