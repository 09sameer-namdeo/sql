package sam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleDBConnection {
	private static Connection connection;
	public static Connection getConnection() throws ClassNotFoundException,SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:xe", "System", "tiger");
		return con;
		
	}

}
