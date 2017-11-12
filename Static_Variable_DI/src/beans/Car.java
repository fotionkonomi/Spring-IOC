package beans;

public class Car {
	
	public static String carName;
	
	public static void setCarName(String carName) {
		Car.carName = carName;
	}
	
	public static void printData(){
		
		System.out.println("Car Name: "+carName);
	}
	

}
