package com.example.travel;

import org.springframework.stereotype.Component;

@Component
public class FlightBooking {
	public void book(String destination)
	{
		System.out.println("Flight booked to "+destination);
	}

}
