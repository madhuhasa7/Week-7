package com.info.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.info.service.Chennai;
import com.info.service.SmartCity;

public class TestSmartCity {

	SmartCity city;
	
	@Test
	public void testBookTourTicketsWithNotNullTickets() {
		city = new Chennai();
		Integer noOfTickets =3;
		city.bookTourismTickets("London", noOfTickets);
		assertNotNull(noOfTickets);
	}
	
	@Test
	public void testBookTourTicketsWithNullTickets() {
		city = new Chennai();
		Integer noOfTickets =null;
		city.bookTourismTickets("London", noOfTickets);
		assertNull(noOfTickets);
	}
	
	@Test
	public void testBookTourTicketsWithEmptyLocation() {
		city = new Chennai();
		String Location="";
		city.bookTourismTickets(Location, 3);
		assertFalse(!Location.isEmpty());
	}
	
	
	@Test
	public void testBookTourTicketsWithNotEmptyLocation() {
		city = new Chennai();
		String Location="London";
		city.bookTourismTickets(Location, 3);
		assertNotNull(Location);
	}
	
	@Test
	public void testHospitalEmergencyWithNullAddress() {
		city = new Chennai();
		String Address=null;
		city.hospitalEmergency(Address);
		assertNull(Address);
	}
	
	@Test
	public void testHospitalEmergencyWithNotNullAddress() {
		city = new Chennai();
		String Address="No:40,Adam Apartment,Chennai-107"; 
		city.hospitalEmergency(Address);
		assertNotNull(Address);
	}
	
	@Test
	public void testgetSchoolAdmissionWithEmptySchoolNameAndGrade() {
		city = new Chennai();
		String schoolName=""; 
		String studentGrade="";
		city.getSchoolAdmission(schoolName, studentGrade);
		assertTrue(schoolName.isEmpty());
		assertTrue(studentGrade.isEmpty());
	}
	
	@Test
	public void testgetSchoolAdmissionWithNotEmptySchoolNameAndGrade() {
		city = new Chennai();
		String schoolName="Maharishi"; 
		String studentGrade="7th grade";
		city.getSchoolAdmission(schoolName, studentGrade);
		assertTrue(!schoolName.isEmpty());
		assertTrue(!studentGrade.isEmpty()); 
	}
}
