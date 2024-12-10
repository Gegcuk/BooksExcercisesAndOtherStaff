package uk.gegc.effectiveJava.part2;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


/*Task: Implement a DatabaseConnectionManager class that accepts a DataSource interface in
its constructor. The class must provide a getConnection() method. Demonstrate
working with different DataSource implementations.*/

public class DataBaseConnectionManager {
    private final DataSource dataSource;

    public DataBaseConnectionManager(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public Connection getConnection() throws SQLException{
        return dataSource.getConnection();
    }
}
