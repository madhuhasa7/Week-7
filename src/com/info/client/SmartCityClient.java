package com.info.client;

import com.info.bean.Guest;
import com.info.factory.SmartFactory;
import com.info.iterator.Iterator;
import com.info.iterator.SmartCities;
import com.info.observer.SuccessAlertForTicketBooking;
import com.info.service.SmartCity;

public class SmartCityClient {

	public static void main(String[] args) {

		// Factory Pattern to create objects
		SmartFactory factory = new SmartFactory();
		SmartCity chennai = factory.selectCity("Chennai");
		chennai.bookTourismTickets("Goa", 4);
		chennai.hospitalEmergency("No:40,Adam Apartment,Chennai-107");
		chennai.getSchoolAdmission("Velammal", "5th");
		System.out.println();
		SmartCity trivandram = factory.selectCity("trivandram");
		trivandram.bookTourismTickets("Manali", 5);
		trivandram.hospitalEmergency("No:40,Babar Apartment,trivandram-109");
		trivandram.getSchoolAdmission("Maharishi", "7th");
		System.out.println();
		// Iterator pattern to show all the smart city names
		SmartCities smartCities = new SmartCities();
		Iterator smartCityList = smartCities.createIterator();

		System.out.println("Iterator pattern to show the smartCity List");
		printCityList(smartCityList);
		
		System.out.println("Observer Pattern to send the success Alert");
		Guest c1 = new Guest("Kiran", 9841846798L, "Goa");
		SuccessAlertForTicketBooking alert = new SuccessAlertForTicketBooking();
		alert.RegisterUser(c1);
		// Send Offer Notification to the registered user using Observer Pattern
		alert.sendOfferNotification(c1);


	}
	private static void printCityList(Iterator iterator) {
		while (iterator.hasNext()) {
			String smartCity = (String)iterator.next();
			System.out.println(smartCity);

		}
	}
}
