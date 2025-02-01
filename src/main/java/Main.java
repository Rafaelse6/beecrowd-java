import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double[] numbers = new double[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = scanner.nextDouble();
        }

        double a = numbers[0];
        double b = numbers[1];
        double c = numbers[2];

        if (a + b > c && a + c > b && b + c > a) {
            double perimeter = a + b + c;
            System.out.printf("Perimetro = %.1f%n", perimeter);
        } else {
            double area = ((a + b) * c) / 2;
            System.out.printf("Area = %.1f%n", area);
        }
    }
}