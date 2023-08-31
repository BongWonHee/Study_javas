import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

import Commons.Commons;

public class CarsWithDB {
    public static void main(String[] args) {
        try {
            // - MySQL workbench 실행 : JDBC
            // - User/password와 접속 IP:port 접속
            String url = "jdbc:mysql://192.168.0.46:3306/db_cars";
            String user = "yojulab";
            String password = "!yojulab*";

            Connection connection = DriverManager.getConnection(url, user, password); // network 자원사용
            System.out.println("DB연결 성공\n");

            // - query Edit
            Statement statement = connection.createStatement(); // DB자원
            String query = "";
            // 작업 키 입력
            Scanner scanner = new Scanner(System.in);
            String workkey = "P";
            while (!workkey.equals("E")) {
                System.out.println("선택입력 : ");
                workkey = scanner.nextLine();
                if (workkey.equals("O")) {
                    // 해당 번호 와 차량 이름
                    System.out.println("- 차 이름 명단");
                    query = "SELECT T_FAC.COMPANY, T_CAR_INFO.CAR_NAME\n" + //
                            "\t\t, T_CAR_INFO.CAR_INFOR_ID\n" + //
                            "FROM (factorys AS T_FAC \n" + //
                            "INNER JOIN car_infors AS T_CAR_INFO\n" + //
                            "ON T_FAC.COMPANY_ID = T_CAR_INFO.COMPANY_ID)";
                    ResultSet resultSet = statement.executeQuery(query); // select문에서 table 형태의 결과값 출력명령어
                    int number = 1;
                    Statement statement2 = connection.createStatement(); // 새로운 스테이트먼트를 쓸때 추가해줘야할 사항.
                    ResultSet resultSet2;
                    String query2;
                    HashMap<String, String> carNumeraMap = new HashMap<>();
                    while (resultSet.next()) {
                        System.out.print(number + " : " + resultSet.getString("COMPANY") + "," +
                                resultSet.getString("CAR_NAME") + " : ");
                        String carInfoId = resultSet.getString("CAR_INFOR_ID");
                        carNumeraMap.put(String.valueOf(number), carInfoId); // car_infor_id 의 PK를 value 로 number를 Key로
                                                                             // 사용하여 hashmap 작성

                        // int를 String으로 받을 때 String.valueOf 를 사용하는 방법
                        // 옵션의 내용을 출력하는 구문
                        query2 = "SELECT T_OPT_INFO.OPTION_NAME\n" + //
                                "FROM option_infors AS T_OPT_INFO\n" + //
                                "INNER JOIN `options` AS T_OPTS\n" + //
                                "ON T_OPT_INFO.OPTION_INFOR_ID = T_OPTS.OPTION_INFOR_ID\n" + //
                                "AND T_OPTS.CAR_INFOR_ID ='" + carInfoId + "'";
                        resultSet2 = statement2.executeQuery(query2);
                        while (resultSet2.next()) {
                            System.out.print(resultSet2.getString("OPTION_NAME") + ",");

                        }
                        number = number + 1;
                        System.out.println();

                    }
                    // 차량번호 입력 :
                    System.out.println("- 차량 번호 입력 -");
                    String CarNumber = scanner.nextLine();
                    // System.out.println("차명 PK " + carNumeraMap.get(CarNumber));
                    System.out.println("--- 선택 가능한 옵션 ---");
                    query = "select OPTION_INFOR_ID, OPTION_NAME\n" + //
                            "from option_infors";
                    resultSet = statement.executeQuery(query);
                    number = 1;
                    HashMap<String, String> carOptionInfor = new HashMap<>();
                    while (resultSet.next()) {
                        System.out.println(number + "," + resultSet.getString("OPTION_NAME") + ",");
                        // 옵션에 있는 PK의 value 와 숫자 Key를 입력. 후 hashmap 생성 하는것.
                        carOptionInfor.put(String.valueOf(number), resultSet.getString("OPTION_INFOR_ID"));
                        number = number + 1;
                    }
                    System.out.println();
                    System.out.print("- 추가 옵션 선택 : ");
                    String optionNumber = scanner.nextLine();
                    String carPK = carNumeraMap.get(CarNumber);
                    String optPK = carOptionInfor.get(optionNumber);
                    System.out.println(carPK + "," + optPK);
                    // delete 옵션
                    query = "delete from `OPTIONS`\n" + //
                            "where car_infor_id = '" + carPK + "' and option_infor_id = '" + optPK + "'";
                    // insert 옵션
                    Commons commons = new Commons();
                    // 유니크한 아이디를 입력하는 class Commons 사용.
                    String optionId = commons.generatUuid();

                    int count;
                    query = "INSERT INTO `OPTIONS`\n" +
                            "(OPTION_ID, CAR_INFOR_ID, OPTION_INFOR_ID)\n" +
                            "value\n" +
                            "('" + optionId + "', '" + carPK + "', '" + optPK + "')";
                    count = statement.executeUpdate(query);

                } else if (workkey.equals("S")) {
                    System.out.println("--- 통계 시작 ---");
                    query = "SELECT T_FAC.COMPANY, T_CAR_INFO.CAR_NAME, COUNT(*) AS CNT\n" + //
                            "FROM (factorys AS T_FAC \n" + //
                            "INNER JOIN car_infors AS T_CAR_INFO\n" + //
                            "ON T_FAC.COMPANY_ID = T_CAR_INFO.COMPANY_ID)\n" + //
                            "INNER JOIN `options` AS T_OPTS\n" + //
                            "ON T_CAR_INFO.CAR_INFOR_ID = T_OPTS.CAR_INFOR_ID\n" + //
                            "group by T_FAC.COMPANY_ID, T_CAR_INFO.CAR_INFOR_ID";
                    ResultSet resultSet = statement.executeQuery(query); // select문에서 table 형태의 결과값 출력명령어
                    while (resultSet.next()) {
                        System.out.println(resultSet.getString("COMPANY") + "," +
                                resultSet.getString("CAR_NAME") + "," +
                                resultSet.getInt("CNT"));
                    }
                } else {
                    System.out.println("--- 작업 키 확인 : 입력한 값 : " + workkey);

                }

            }
            System.out.println("--- 작업 종료 ----");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}