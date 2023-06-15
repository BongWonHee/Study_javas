package surveys;

import java.sql.ResultSet;
import java.sql.Statement;

public class Statistics {
    public int getRespondents(Statement statement) {
        try {
            String queryA = "select count(*) CNT\n" + //
                    "from\n" + //
                    "(SELECT \n" + //
                    "RESPONDENTS_ID, COUNT(RESPONDENTS_ID) AS CNT\n" + //
                    "FROM\n" + //
                    "statistics\n" + //
                    "GROUP BY RESPONDENTS_ID) as T_STATIC ";
            ResultSet resultSet = statement.executeQuery(queryA);
            System.out.println("--- 통계 ---");
            // -- 총 설문자 : 3명

            // select문에서 table 형태의 결과값 출력명령어
            while (resultSet.next()) {
                System.out.println("--- 총 질문자 : " + resultSet.getString("CNT"));
            }
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
        return 0;
    }

}