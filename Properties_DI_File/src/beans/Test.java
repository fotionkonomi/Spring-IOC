package beans;

import java.util.Properties;

public class Test {

	private Properties driver;
	
	public void setDriver(Properties driver) {
		this.driver = driver;
	}
	
	public void printData() {
		System.out.println("Properties: "+driver);
	}
}
