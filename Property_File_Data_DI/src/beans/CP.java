package beans;

import java.sql.Connection;
import java.sql.DriverManager;


public class CP {
	
	private String driver,url, userName, pass;
	
	
	
	public void setDriver(String driver) {
		this.driver = driver;
	}



	public void setUrl(String url) {
		this.url = url;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public void setPass(String pass) {
		this.pass = pass;
	}



	public void createConnection() {
		
		try{
			
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, userName, pass);
			System.out.println(conn);
			
		}catch(Exception e){}
	}
	
	
}
