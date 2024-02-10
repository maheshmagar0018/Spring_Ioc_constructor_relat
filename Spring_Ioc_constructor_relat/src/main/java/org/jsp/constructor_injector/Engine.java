package org.jsp.constructor_injector;

public class Engine {
	
	String type;
	int cc;
	
	public Engine(String type, int cc)
	{
		this.type=type;
		this.cc=cc;
	}

	public void engineDetails()
	{
		System.out.println("Type of engine is : "+type);
		System.out.println("CC of engine is : "+cc);
	}
	
}
