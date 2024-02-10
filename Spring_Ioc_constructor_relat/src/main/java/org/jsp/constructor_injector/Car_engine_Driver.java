package org.jsp.constructor_injector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Car_engine_Driver {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("car_engine.xml");
		Car car = context.getBean(Car.class,"mycar");
		car.carDetails();
		
		
	}

}
