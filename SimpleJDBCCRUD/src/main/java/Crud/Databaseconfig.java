package Crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Databaseconfig 
{
	private Connection connection;
	
	public Databaseconfig(String driver, String url, String user, String pwd) throws ClassNotFoundException,SQLException
	{
		Class.forName(driver);
		this.connection=DriverManager.getConnection(url,user,pwd);
	}
	public Connection getConnection()
	{
		return connection;
	}
	public void closeConnection() throws SQLException{
		this.connection.close();
	}
}
