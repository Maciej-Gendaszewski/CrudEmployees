import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionTest {


    private String url = "jdbc:mysql://localhost:3306/employees?useSSL=false";
    private String user = "user";
    private String password = "password";

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testConnection() {
        try {
            Connection myConn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            Assert.assertNull(e);
        }
    }


}
