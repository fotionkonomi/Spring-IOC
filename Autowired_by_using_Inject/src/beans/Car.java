package beans;

import javax.annotation.Resource;

public class Car {
	
	
	//Reource use byName name property while autowiring
	@Resource
	private Engine engine;
	
	
	
	public void printData() {
		
		System.out.println("Model Year: "+engine.getModelYear());
		
	}
	
	
}
