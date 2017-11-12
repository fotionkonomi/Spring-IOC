package beans;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans/spring1.xml");
		
		Test t = (Test)context.getBean("t");
		
		t.print();
	}

}
