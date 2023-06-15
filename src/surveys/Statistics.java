package surveys;

import java.sql.ResultSet;
import java.sql.Statement;

public class Statistics {
    // method에는 main필요 없다..
    public int getRespondents(Statement statement){
        try {
             String queryB = "SELECT COUNT(*) CNT\n" + //
                    "FROM (SELECT RESPONDENTS_ID, COUNT(*) AS CNT\n" + //
                    "FROM statistics\n" + //
                    "GROUP BY RESPONDENTS_ID) AS t_STATIC";
            
            // select문에서 table 형태의 결과값 출력명령어
            ResultSet reusltSet = statement.executeQuery(queryB);
            while (reusltSet.next()) {
                System.out.println("총 설문자: " + reusltSet.getString("CNT"));

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // TODO: handle exception
        }
        return 0;
    }
}
//파라미터가 statement임.ㅠㅠ,datatype도 맞춰줌
//
