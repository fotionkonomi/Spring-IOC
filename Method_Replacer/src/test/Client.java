package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bank;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext app =new ClassPathXmlApplicationContext("resource/spring.xml");
		
		Bank b = (Bank) app.getBean("b");
		b.deposit();
		b.withdraw();
		b.calInt();
	}
}
