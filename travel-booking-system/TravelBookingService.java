package com.example.travel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TravelBookingService {
	
	private final FlightBooking flightbooking;
	
	private final TrainBooking trainbooking;
	@Autowired
	public TravelBookingService(FlightBooking flightbooking, TrainBooking trainbooking) {
		this.flightbooking = flightbooking;
		this.trainbooking = trainbooking;
	}
	public void bookTravel(String mode,String destination)
	{
		if("flight".equalsIgnoreCase(mode))
		{
			flightbooking.book(destination);
		}
		else if("train".equalsIgnoreCase(mode))
		{
			trainbooking.book(destination);
		}
		else
		{
			System.out.println("Invalid mode of travel");
		}
	}
	

	

}
