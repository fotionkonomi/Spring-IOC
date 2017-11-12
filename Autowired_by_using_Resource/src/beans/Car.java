package beans;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	
	
	//Reource use byName name property while autowiring
	@Qualifier(value="e1")
	@Inject
	private Engine engine;
	
	
	
	public void printData() {
		
		System.out.println("Model Year: "+engine.getModelYear());
		
	}
	
	
}
