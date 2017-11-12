package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bus;
import beans.Car;
import beans.Truck;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("resources/spring.xml");
		
		System.out.println("-------------Car----------------");
		Car c = (Car) app.getBean("c");
		System.out.println(c.carEngine().getName());
		System.out.println(c.getClass().getCanonicalName());
		
		System.out.println("-------------Bus----------------");
		Bus b = (Bus) app.getBean("b");
		System.out.println(b.busEngine().getName());
		System.out.println(c.getClass().getCanonicalName());
		
		System.out.println("-------------Bus----------------");
		Truck t = (Truck) app.getBean("t");
		System.out.println(t.truckEngine().getName());
		System.out.println(c.getClass().getCanonicalName());
	}
}
