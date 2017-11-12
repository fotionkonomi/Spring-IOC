package beans;

public class CarFactory {
	
	private static String carName;
	
	public static void setCarName(String carName) {
		CarFactory.carName = carName;
	}
	
	public static Car getInstance() throws Exception {
		
		Car c = (Car) Class.forName(carName).newInstance();
		
		return c;
	}

}
