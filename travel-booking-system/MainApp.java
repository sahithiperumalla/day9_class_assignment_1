package com.example.travel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainApp {
	public static void main(String[] args)
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
		TravelBookingService bookingService=context.getBean(TravelBookingService.class);
		
		bookingService.bookTravel("flight", "Banglore");
		bookingService.bookTravel("train", "Ooty");
		
		((AbstractApplicationContext)context).close();

	}
	
	
}
