import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionTest {

    private final String url = "jdbc:h2:mem:testdb;DB_CLOSE_DELAY=- 1;DB_CLOSE_ON_EXIT=FALSE";

    @Test
    public void testConnection() throws SQLException {
        Connection conn = DriverManager.getConnection(url);
        conn.close();
    }


}
