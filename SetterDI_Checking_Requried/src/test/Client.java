package test;

import java.sql.SQLException;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

public class Client {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		ApplicationContext app = new ClassPathXmlApplicationContext("resources/spring.xml");
		
		Test tt = (Test) app.getBean("t");
		
		tt.printConn();
	}

}
