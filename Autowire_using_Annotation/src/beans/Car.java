package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

	@Qualifier(value="e1")
	@Autowired
	private Engine engine;
	
	/*public Car() {
		System.out.println("Default Constructor.....");
	}*/
	
	/*public void setEngine(Engine engine) {
		System.out.println("In the setter.....");
		this.engine = engine;
	}*/
	
	
	/*public Car(Engine engine) {
		System.out.println("Parameterized Constructor.....");
		this.engine = engine;
	}*/
	
	public void printData() {
		
		System.out.println("Model Year: "+engine.getModelYear());
		
	}
	
	
}
