import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        int a;
        a = my.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = a-1; j > i; j-=1) {
                System.out.print(" ");
                
                    
                } for (int j2 = 0; j2 <= i; j2++) {
                    System.out.print("*");
                
            }System.out.println();
        }
        

    }

}
