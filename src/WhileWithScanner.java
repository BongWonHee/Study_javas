import java.util.Scanner;

public class WhileWithScanner {
    // 콜센터 업무 안내 작성
    public static void main(String[] args) {
        // try, catch문 사용
        // 횟수가 있으면 For문 횟수가 없다면 While을 사용한다.
        try {
            Scanner myOjt = new Scanner(System.in);
            String answer = "";
            System.out.println("안내 입니다.");
            boolean loops = true; //조건이 false가 선언 될때까지 Loop가 작동한다.
            while(loops){
            System.out.println("1 - 대출, 2 - 예금, 3~9 - 종료.");
            System.out.print("입력 바랍니다.");           
            answer = myOjt.nextLine();
            if (answer.equals("1")) { //문자는 숫자와 비교가 가능하지 않습니다. 해당 문자열을 .equals() 사용해서 비교가능하게 한다.
                System.out.println("대출 업무입니다.");
            } else if (answer.equals("2")) {
                System.out.println("예금 업무입니다.");
            } else {
                System.out.println("업무종료 입니다.");
                break;

            }
        }
        } catch (Exception e) {
            System.out.println();
        } finally {
            System.out.println();
        }
        System.out.println();
    }// return 0 ;
}
