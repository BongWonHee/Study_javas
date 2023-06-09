import java.sql.*;

import javax.naming.spi.DirStateFactory.Result;

public class ConnectDBs {
    public static void main(String[] args) {
        try {
            // - MySQL workbench 실행 : JDBC
            // - User/password와 접속 IP:port 접속
            String url = "jdbc:mysql://localhost:3306/db_cars";
            String user = "root";
            String password = "!yojulab*";

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");

            // - query Edit
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM factorys";
            ResultSet resultSet = statement.executeQuery(query); // select문에서 table 형태의 결과값 출력명령어
            while (resultSet.next()) {
                System.out.println(resultSet.getString("COMPANY_ID") +
                        resultSet.getString("COMPANY"));

            }

            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println();
        // retrun 0 ;;
    }
}
