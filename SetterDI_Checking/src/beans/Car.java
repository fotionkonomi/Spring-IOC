package beans;

public class Car {

	private String carNane;
	private Engine engine;
	
	
	public void setCarNane(String carNane) {
		this.carNane = carNane;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void printData() {
		
		System.out.println(carNane);
		System.out.println(engine.getModelYear());
	}
}
