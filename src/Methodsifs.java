
import java.util.Scanner;

public class Methodsifs {

    public String alltime(int times) {
        String str = "";
        try {
            if (times < 12) {
                str = "오전입니다.";
            } else if (times < 18) {
                str = "오후입니다.";

            } else if(times > 25) { 
                str = "밤 입니다.";
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
        return str;
    }

    public static void main(String[] args) {

        try {
            
            int times = 0; // time 0 ~ 24까지 사용함다.
            while(times < 25){
            
            Scanner my = new Scanner(System.in);
            times = my.nextInt();

            Methodsifs methodsifs = new Methodsifs();
            String Resulttime = methodsifs.alltime(times);
            System.out.println(Resulttime);
            }

        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
