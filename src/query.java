import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class query {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        HashMap hashmap = new HashMap();
        try {
            String url = "jdbc:mysql://192.168.0.46:3306/db_usersurvey";
            String user = "yojulab";
            String password = "!yojulab*";

            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();
            Statement statement2 = connection.createStatement();
            System.out.println("성공");
            String query = "SELECT QUESTION FROM question;";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                hashmap = new HashMap<>();
                System.out.println(resultSet.getString(query));
            }
            statement.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
