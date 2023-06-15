import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

import Surveys.Statistics;

import cars.FactoryDMLs;

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
                    System.out.print(number + "." + resultSet_second.getString("choice")+ " ");
                    number = number + 1;
                    
                }
                System.out.println();
            }

            // -- 총 설문자 : 3명
            // select문에서 table 형태의 결과값 출력명령어
            Statistics statistics = new Statistics();
            statistics.getRespondents(statement);

            // SELECT COUNT(*) CNT
            // FROM (SELECT RESPONDENTS_ID, COUNT(*) AS CNT
            // FROM statistics
            // GROUP BY RESPONDENTS_ID) AS t_STATIC;

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

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }// return 0 ;
}
