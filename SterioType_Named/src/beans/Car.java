package beans;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Named
public class Car {
	
	//@Autowired
	@Resource  //we can use @Autowire also
	private Engine eng;
	
	public void printData() {
		
		System.out.println("Engine Name: "+eng.getEngName());
	}
	
	

}
