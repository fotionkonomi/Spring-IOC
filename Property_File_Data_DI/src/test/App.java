package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.CP;


public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring.xml");
		
		CP cp = (CP) context.getBean("cp");
		cp.createConnection();
	}
}
