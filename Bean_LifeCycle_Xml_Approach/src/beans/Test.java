package beans;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Test  {

	private String driver,url, user, pass;
	private Connection conn;
	
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	
	
	public void conCleanup() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Closing resources connection...");
		conn.close();
	}

	public void save(int id, String name, String email, String address) {
		System.out.println("Saving user...");
		
	}
	public void conInit() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Creating connection in life cycle");
		Class.forName(driver);
		conn = DriverManager.getConnection(url, user, pass);
		
	}

	
}
