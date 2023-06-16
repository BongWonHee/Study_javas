import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Scanner;

import Commons.Commons;
import cars.FactoryDMLs;
import surveys.Statistics;

import java.util.ArrayList;

public class SurveysApp {
    public static void main(String[] args) {
        try {
            // - MySQL workbench 실행 : JDBC
            // - User/password와 접속 IP:port 접속
            String url = "jdbc:mysql://127.0.0.1:3306/db_survey";
            String user = "root";
            String password = "!yojulab*";
            String queryA = "";
            Connection connection = DriverManager.getConnection(url, user, password); // network 자원사용
            System.out.println("DB연결 성공\n");

            // - query Edit
            Statement statement = connection.createStatement(); // DB자원

            System.out.println("--- 설문자 가능 명단 ---");

            // - 설문자 가능 명단(가입 완료)
            // 1. 홍길동, 2.장길산, 3.신사임당, ...
            queryA = "select *\n" + //
                    "From respondents";

            ResultSet resultSet = statement.executeQuery(queryA);
            int number = 1;
            while (resultSet.next()) {
                System.out.print(number + "." + resultSet.getString("RESPONDENTS") + "  ");
                number = number + 1;
            }
            System.out.println();

            // -- 설문 시작
            // -------- 참조 : poll contents example -------------
            // -- 1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?
            // -- (1)전혀 아니다. (2)아니다. (3)그렇다. (4)매우그렇다.
            // -- 2. 강의의 내용은 체계적이고 성의있게 구성되었는가?
            // -- (1)전혀 아니다. (2)아니다. (3)그렇다. (4)매우그렇다.
            System.out.println("--- 설문 시작 ---");
            queryA = "select *\n" +
                    "From questions";

            resultSet = statement.executeQuery(queryA);
            Statement statement_second = connection.createStatement();
            while (resultSet.next()) {
                System.out.println(resultSet.getString("questions"));
                queryA = "select *\n" + //
                        "From choice";

                ResultSet resultSet_second = statement_second.executeQuery(queryA);
                number = 1;
                while (resultSet_second.next()) {
                    System.out.print(number + "." + resultSet_second.getString("choice") + " ");
                    number = number + 1;

                }
                System.out.println();
            }

            // -- 총 설문자 : 3명
            // select문에서 table 형태의 결과값 출력명령어
            Statistics statistics = new Statistics();
            statistics.getRespondents(statement);

            String queryB = "SELECT COUNT(*) CNT\n" + //
                    "FROM (SELECT RESPONDENTS_ID, COUNT(*) AS CNT\n" + //
                    "FROM statistics\n" + //
                    "GROUP BY RESPONDENTS_ID) AS t_STATIC";
            // FactoryDMLs factoryDMLs = new FactoryDMLs();
            // ResultSet resultSet = factoryDMLs.selectStatements(statement, query); //
            // select문에서 table 형태의 결과값 출력명령어
            ResultSet reusltSet = statement.executeQuery(queryB);
            while (reusltSet.next()) {
                System.out.println(reusltSet.getString("CNT"));
            }
            // }
            // 입력키하기
            System.out.println("--- 설문자 가능 명단 ---");
            // 2) - 설문자 가능 명단(가입 완료)
            // 1. 홍길동, 2.장길산, 3.신사임당, ...<숫자 넘버링은 출력때 만들어준다.
            queryA = "SELECT * \n" + //
                    "FROM respondents";
            resultSet = statement.executeQuery(queryA);
            number = 1;
            Scanner scanners = new Scanner(System.in);

            HashMap<String, String> repondentsInfo = new HashMap<String, String>();
            while (resultSet.next()) {
                System.out.print(number + "." + resultSet.getString("respondents"));
                number = number + 1;
                repondentsInfo.put(String.valueOf(number), resultSet.getString("respondents_ID"));
                System.out.println();
            }
            System.out.print("설문자 선택:");
            String respondent = scanners.nextLine();

            // 3) 설문 시작 리뷰는 1, 2번만 할 예정. 답은 우선 생략한다.
            // -- 1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?
            // -- 2. 강의의 내용은 체계적이고 성의있게 구성되었는가?

            System.out.println("설문 시작");
            queryA = "SELECT *\n" + //
                    "FROM questions\n";
            resultSet = statement.executeQuery(queryA);
            number = 1;
            statement_second = connection.createStatement();

            Commons commons = new Commons(); // get.generic???
            while (resultSet.next()) {
                System.out.println(resultSet.getString("QUESTIONS"));
                // 4) 답항 나오는건 질문이 사라지지 않게 종속적인 쿼리문필요
                // (1)이 답항이 나오기 위한 쿼리문의 위치_순환적으로 가지고 와야함
                // (2)이걸 while문으로 돌려야함. while문 안에서 쿼리가 돌아가야함.
                queryA = "SELECT t_CHO.CHOICE_ID, t_CHO.CHOICE\n" + //
                        "FROM question_choice AS t_QUES\n" + //
                        " INNER JOIN choice AS t_CHO\n" + //
                        " ON t_QUES.CHOICE_ID = t_CHO.CHOICE_ID\n" + //
                        "AND QUESTIONS_ID = 'Q1'";
                ResultSet resultSet_second = statement_second.executeQuery(queryA);
                int number_second = 1;
                HashMap<String, String> choiceInfor = new HashMap<String, String>();

                while (resultSet_second.next()) {
                    System.out.print(number_second + ") " + resultSet_second.getString("CHOICE"));
                    number_second = number_second + 1;
                    choiceInfor.put(String.valueOf(number_second), resultSet_second.getString("CHOICE"));
                    // 이렇게 1번이 CHOICE의 pk와 매칭. 이걸 get으로 받되 아래 scanner 의 choice_key로 받는다.

                    // INSERT 문 작성_응답자 및 설문질문 및 입력
                    // 설문자는 숫자로 답한다. BUT DB에는 답PK로 존재함.
                    // 고로 DB의 답PK가 몇번의 숫자인지를 HASHMAP으로 숫자1은 답PK C1임을 설정해준다.

                }
                number = number + 1;
                System.out.println();
                System.out.println("답항 선택 :");

                String choice_key = scanners.nextLine();
                queryA = "INSERT INTO statistics\n" + //
                        "(STATISTICS_ID,RESPONDENTS_ID,QUESTIONS_ID,CHOICE_ID)\n" + //
                        "VALUES\n" + //
                        "('" + commons.generatUuid() + "', '" + repondentsInfo.get(respondent) + "','"
                        + resultSet.getString("QUESTIONS_ID") + "','" + choiceInfor.get(choice_key) + "');";
                // 이 답항 부분을 고민해야함. C3..이걸 매칭할수있는 값을 만들어야함.
                // Q1도 getString받되 PK로 받기
                // 'R1'에 대한건 HASHMAP으로 설문자 선택을하여 가져온다.
            }
            System.out.println();

            // 만든 순서 1) 총 설문자 표시

            statistics = new Statistics();
            statistics.getRespondents(statement);
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }// return 0 ;
}
