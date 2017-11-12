package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Simple;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring.xml");
		
		Simple simple = (Simple) context.getBean("s");
		
		simple.printCollectionData();
		
	}
}
