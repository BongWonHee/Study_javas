import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner my = new Scanner(System.in);
        // int a;
        // a = my.nextInt();

        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j -= 1) {
                System.out.print("s");

                for (int k = 0; k < i; k++) {
                    System.out.print("*");
                }
            }

        }
        System.out.println();

    }

}
