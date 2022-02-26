package com.info.service;

public class Chennai extends SmartCity {

	public Chennai() {
		System.out.println("Smart City Chennai!");
	}
	@Override
	public void bookTourismTickets(String location, Integer noOfTickets) {
		// TODO Auto-generated method stub
		if (noOfTickets != null && !location.isEmpty())
			System.out.println(noOfTickets + " Tickets booked successfully for the location " + location);
	}

	@Override
	public void hospitalEmergency(String address) {
		// TODO Auto-generated method stub
		if (address != null && !address.isEmpty())
			System.out.println("Booked ambulance to the location " + address);

	}

	@Override
	public void getSchoolAdmission(String schoolName, String studentGrade) {
		// TODO Auto-generated method stub
		if(!schoolName.isEmpty() && !studentGrade.isEmpty())
		System.out.println("Admission booked in the school "+schoolName+" for the grade "+studentGrade);
	}
	

	

}
