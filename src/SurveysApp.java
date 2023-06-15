import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

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

            System.out.println("--- 통계 ---");
            // -- 총 설문자 : 3명

            queryA = "select count(*) CNT\n" + //
                    "from\n" + //
                    "(SELECT \n" + //
                    "RESPONDENTS_ID, COUNT(RESPONDENTS_ID) AS CNT\n" + //
                    "FROM\n" + //
                    "statistics\n" + //
                    "GROUP BY RESPONDENTS_ID) as T_STATIC ";
            ResultSet resultSet = statement.executeQuery(queryA); // select문에서 table 형태의 결과값 출력명령어
            while (resultSet.next()) {
                System.out.println("--- 총 질문자 : " + resultSet.getString("CNT"));

            }

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }// return 0 ;
}
