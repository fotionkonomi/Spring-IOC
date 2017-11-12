package test;

import java.util.Scanner;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

public class Client {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext config = new ClassPathXmlApplicationContext("resource/spring.xml");
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 1 for save data and 2 for close");
			int i = sc.nextInt();
			switch (i) {
			case 1:
					Test t = (Test) config.getBean("t");
					System.out.println("Enter id");
					int id = sc.nextInt();
					System.out.println("Enter Name");
					String name = sc.next();
					
					System.out.println("Enter Email");
					String email = sc.next();
					System.out.println("Enter address");
					String address = sc.next();
					//t.save(id, name, email, address);
					
				break;

			default:
				config.close();
				break;
			}
			
			
		}
	}
}
