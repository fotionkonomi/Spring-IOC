package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		
		
		ApplicationContext  app = new ClassPathXmlApplicationContext("resources/spring.xml");
	}

}
