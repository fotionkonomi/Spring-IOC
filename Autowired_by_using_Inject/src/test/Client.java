package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("resource/spring.xml");
		
		Car c = (Car) app.getBean("c");
		System.out.println(c.getClass().getCanonicalName());
		c.printData();
		
	}
}
