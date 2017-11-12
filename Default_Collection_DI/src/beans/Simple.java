package beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Simple {

	private List fruits;
	private Set cricketers;
	private Map cc;
	
	
	public void setCc(Map cc) {
		this.cc = cc;
	}
	
	public void setFruits(List fruits) {
		this.fruits = fruits;
	}
	
	 public void setCricketers(Set cricketers) {
		this.cricketers = cricketers;
	}
	 
	public void printCollectionData() {
		
		System.out.println("Fruitts: "+fruits);
		System.out.println("Cricketes: "+cricketers);
		System.out.println("Country and Captials"+cc);
		
	}
	
	
}
