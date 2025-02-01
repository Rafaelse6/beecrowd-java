import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++){
            numbers[i] = scanner.nextInt();
        }

        int []original = numbers.clone();

        Arrays.sort(numbers);

        for (int num: numbers){
            System.out.println(num);
        }

        System.out.println();

        for (int num: original){
            System.out.println(num);
        }
    }
}