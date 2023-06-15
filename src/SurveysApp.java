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
            String query = "";
            Connection connection = DriverManager.getConnection(url, user, password); // network 자원사용
            System.out.println("DB연결 성공\n");

            // - query Edit
            Statement statement = connection.createStatement(); // DB자원
            FactoryDMLs factoryDMLs = new FactoryDMLs();
            ResultSet resultSet = factoryDMLs.selectStatements(statement, query); // select문에서 table 형태의 결과값 출력명령어
            while (resultSet.next()) {
                System.out.println(resultSet.getString("COMPANY_ID") +
                        resultSet.getString("COMPANY"));

            }

        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }

    }// return 0 ;
}
