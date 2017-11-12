package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

/**
 * This class is setter based secondary type dependency injection
 * @author pc world
 *
 */
public class MainApp {

	public static void main(String[] args) {
		
		//This is used for multiple bean files
		
		/*String files[] = new String[]{"resources/engine.xml","resources/car.xml"};
		ApplicationContext context = new ClassPathXmlApplicationContext(files);*/
		
		//For single bean file
		ApplicationContext context  = new ClassPathXmlApplicationContext("resources/car-engine.xml");
		Car c  = (Car)  context.getBean("c");
		
		c.printCarData();
	}
}
