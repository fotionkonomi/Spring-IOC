package beans;

import java.util.Properties;

public class Test {

	private Properties prop;
	
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	
	public void printData() {
		System.out.println("Properties: "+prop);
		
	}
	
}
