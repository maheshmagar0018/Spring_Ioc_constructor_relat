package org.jsp.constructor_injector;

public class Car {
	
	String name;
	String color;
	double price;
	String brand;
	
	public Engine engine;
	
	public Car(Engine engine, String name, String color, double price, String brand)
	{
		this.engine= engine;
		this.name= name;
		this.color= color;
		this.price= price;
		this.brand= brand;
	}
	
	public void carDetails()
	{
		System.out.println("Name of the car is : "+name);
		System.out.println("Color of the car is : "+color);
		System.out.println("Price of the car is : "+price);
		System.out.println("Brand of the car is : "+brand);
		engine.engineDetails();
	}

}
