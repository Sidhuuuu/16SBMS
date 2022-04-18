package in.ashokit.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.beans.Car;

public class Driver {

	public static void main(String[] args)
	{
		//start IOC container 
	ApplicationContext ctxt=new ClassPathXmlApplicationContext("Beans.xml");
	
	Car car=ctxt.getBean(Car.class);
	 
	car.drive();
	}
}
