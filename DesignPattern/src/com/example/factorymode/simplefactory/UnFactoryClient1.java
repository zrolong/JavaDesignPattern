package com.example.factorymode.simplefactory;

public class UnFactoryClient1 {
	
	public static void main(String[] args) {
		
		Car c1 = new Audi();
		Car c2 = new Byd();
		
		c1.run();
		c2.run();
	}

}
