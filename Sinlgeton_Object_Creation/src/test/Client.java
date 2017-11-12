package test;

import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("resources/spring.xml");
		
		Test t = (Test) app.getBean("t");
		Test t1 = (Test) app.getBean("t");
		System.out.println(t==t1);
		
		Calendar c = (Calendar) app.getBean("c");
		Calendar c1 = (Calendar) app.getBean("c");
		System.out.println(c==c1);
	}
}
