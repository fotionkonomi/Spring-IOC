package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Required;

public class Test {
	
	
	private String  driver;
	private String url;
	private String user;
	private String password;
	
	@Required
	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	
	public void setPassword(String password) {
		this.password = password;
	}
	@Required
	public void setUrl(String url) {
		this.url = url;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	
	public void printConn() throws ClassNotFoundException, SQLException {
		
		Class.forName(driver);
		Connection conn = DriverManager
				.getConnection(url);
		
		System.out.println(conn);
	}
}
