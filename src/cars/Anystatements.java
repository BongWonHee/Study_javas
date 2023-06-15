package cars;

import java.sql.ResultSet;
import java.sql.SQLException; 
import java.sql.Statement;

public class Anystatements {
    public ResultSet selectStatements(Statement statement, String query)throws SQLException{

        ResultSet resultSet = statement.executeQuery(query);

        return resultSet ;
    }

}
