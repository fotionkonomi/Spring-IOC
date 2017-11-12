package beans;

public class Car {

	private Engine engine;
	
	/*public Car() {
		System.out.println("Default Constructor.....");
	}*/
	public void setEngine(Engine engine) {
		System.out.println("In the setter.....");
		this.engine = engine;
	}
	
	
	public Car(Engine engine) {
		System.out.println("Parameterized Constructor.....");
		this.engine = engine;
	}
	
	public void printData() {
		
		System.out.println("Model Year: "+engine.getModelYear());
		
	}
	
	
}
