import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int n = scanner.nextInt();
        for (int i = 2; i <=n; i+= 2){
            int result = i * i;
            System.out.println(i + "^2 = " + result);
        }
        scanner.close();
    }
}