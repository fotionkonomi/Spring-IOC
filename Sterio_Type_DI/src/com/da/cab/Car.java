package com.da.cab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.da.eng.Engine;

@Component
public class Car {

	@Autowired
	private Engine engine;
	
	public void printData() {
		System.out.println("Engine Name: "+engine.getEngineName());
	}
}
