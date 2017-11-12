package beans;

import java.util.Hashtable;
import java.util.TreeSet;
import java.util.Vector;

public class Test {

	private Vector fruits;
	private TreeSet cricketers;
	private Hashtable cc;
	
	
	public void setCc(Hashtable cc) {
		this.cc = cc;
	}
	
	public void setCricketers(TreeSet cricketers) {
		this.cricketers = cricketers;
	}
	
	public void setFruits(Vector fruits) {
		this.fruits = fruits;
	}
	
	public void printData() {
		
		System.out.println("Fruits: "+fruits);
		System.out.println("Cricketers: "+cricketers);
		System.out.println("Country and Capitals: "+cc);
		
	}
}
