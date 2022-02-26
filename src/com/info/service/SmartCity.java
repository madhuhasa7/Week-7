package com.info.service;

public abstract class SmartCity {

	public abstract void bookTourismTickets(String location, Integer noOfTickets);

	public abstract void hospitalEmergency(String address);
	
	public abstract void getSchoolAdmission(String schoolName,String studentGrade);
	
}
