
import java.util.Scanner;

public class PollWhiles {
    public static void main(String[] args) {
        //해당 입력키에 따라 안내문이 출력합니다.
        try {

            Scanner myOjt = new Scanner(System.in);

            String taja = "";
            boolean loops = true;
            while (true) {
                System.out.println("선택에 따라 안내글을 보여드립니다.");
                taja = myOjt.nextLine();
                if (taja.equals("E")) { //입력키 문자타입을 입력 받을때는.equals 를 사용자!!
                    System.out.println("-----설문 종료-----");
                } else if (taja.equals("Exit")) {
                    System.out.println("-----설문 종료-----");

                } else if (taja.equals("P")) {
                    System.out.println("-----설문 통계-----");

                } else if (taja.equals("Poll")) {
                    System.out.println("-----설문 통계-----");

                } else if (taja.equals("S")) {
                    System.out.println("-----설문 시작-----");

                } else if (taja.equals("Statistic")) {
                    System.out.println("-----설문 시작-----");

                } else {
                    System.out.println("설문에 참여해주셔서 감사합니다.");
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println();
        } finally {
            System.out.println();

        }

        // return 0;

        System.out.println();
    }

}
