import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a % b == 0 || b % a == 0){
            System.out.println("Sao Multiplos");
        }else {
            System.out.println("Nao sao Multiplos");
        }
    }
}