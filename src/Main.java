import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner taja = new Scanner(System.in);

        int a;
        int b;

        a = taja.nextInt();
        b = taja.nextInt();
         
        if (a < 0 || b < 0) {
            System.out.println("1");
        } else if(a > 0 || b < 0){
            System.out.println("2");
        }

    }

    // return 0;

}
