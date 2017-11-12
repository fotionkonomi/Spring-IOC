package beans;

import java.util.Iterator;

public class Car {

	private String[] carNames;
	private Engine[] engines;
	
	public void setCarNames(String[] carNames) {
		this.carNames = carNames;
	}
	
	public void setEngines(Engine[] engines) {
		this.engines = engines;
	}
	
	public void printCarData() {
		
		for(String car: carNames) {
			
			System.out.println(car);
		}
		
		for(Engine e: engines) {
			
			System.out.println(""+e.getModelYear());
		}
	}
	
	
}
