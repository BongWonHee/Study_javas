import java.util.Scanner;

public class PollWithoutMethod {
    public static void main(String[] args) {
        Scanner myOjt = new Scanner(System.in);

        System.out.println("이름을 입력하세요");
        String name = myOjt.nextLine();
        System.out.println("이름) " + name);
        String[] answer = { "", "", "", "" };
        int con = 0;
        String[][] Que = {
                { "1.교수는 수업 전 강의 목표를 명확히 제시하였습니까?" },
                { "(1)전혀 아니다  (2)아니다.  (3)그렇다.  (4)매우그렇다." },
                { "2.강의의 내용은 체계적이고 성의있게 구성되었는가?" },
                { "(1)전혀 아니다  (2)아니다.  (3)그렇다.  (4)매우그렇다." },
                { "3.교수는 강의 내용에 대해 전문적 지식이 있었는가?" },
                { "(1)전혀 아니다  (2)아니다.  (3)그렇다.  (4)매우그렇다." },
                { "4.강의 진행 속도는 적절하였는가?" },
                { "(1)전혀 아니다  (2)아니다.  (3)그렇다.  (4)매우그렇다." },
        };
        for (int first = 0; first < Que.length; first = first + 2) {
            System.out.println(Que[first][0]);
            for (int second = 0; second < Que[first].length; second = second + 2) {
                System.out.println(Que[second + 1][0]);
                // System.out.print(Que[second + 1][0]);
                // System.out.print(Que[second + 1][1]);
                // System.out.print(Que[second + 1][2]);
                // System.out.print(Que[second + 1][3]);
                String anw = myOjt.nextLine();
                System.out.println("답) " + anw);
                answer[con] = anw;
                con = con + 1;

            }
           
        }
        System.out.println("----------- 설 문 종 료 ----------");
        System.out.println("----------- 결 과 출 력 ----------");
        for (int th = 0; th < answer.length; th = th + 1)
            System.out.print(answer[th] + ",");


        System.out.println();
    }

    // return 0 ;
}
