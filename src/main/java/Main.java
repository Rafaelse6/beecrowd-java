import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int teaType = scanner.nextInt();
        int correctCount = 0;

        for (int i = 0; i < 5; i++){
            if (scanner.nextInt() == teaType){
                correctCount++;
            }
        }
        System.out.println(correctCount);
    }
}