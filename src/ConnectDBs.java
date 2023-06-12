import java.sql.*;

import javax.naming.spi.DirStateFactory.Result;

public class ConnectDBs {
    public static void main(String[] args) {
        try {
            // - MySQL workbench 실행 : JDBC
            // - User/password와 접속 IP:port 접속
            String url = "jdbc:mysql://127.0.0.1:3306/db_cars";
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
            query = "select count(*) as CNT from factorys;";
            resultSet = statement.executeQuery(query); // select문에서 table 형태의 결과값 출력명령어
            int totalCount = 0;
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("CNT"));
                totalCount = resultSet.getInt("CNT");

            }

            // insert into factorys
            // (COMPANY_ID, COMPANY)
            // value
            // ('CAR-01', 'AUDI');

            String companyid = "CAR-01";
            String company = "AUDI";
            int count = 0;

            query = "insert into factorys " + "(COMPANY_ID, COMPANY) " + "value " + "('" + companyid + "', '" + company
                    + "') ";
            count = statement.executeUpdate(query); // executeUpdate 는 insert, update, delete 를 사용할때 씀

            query = " UPDATE factorys " + "SET COMPANY = '페라리' " + "WHERE COMPANY_ID = '"+companyid+"' ";
            count = statement.executeUpdate(query); // CAR-01 의 AUDI를 페라리로 변경
          
            query = "delete FROM factorys " + "WHERE COMPANY_ID = '"+companyid+"'";
            count = statement.executeUpdate(query); // CAR-01 삭제
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        System.out.println();
        // retrun 0 ;;
    }
}
