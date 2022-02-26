package com.info.bean;

public class Guest {
	
	private String customerName;
	
	private long contactNo;
	
	private String location;

	public Guest(String customerName, long contactNo, String location) {
		super();
		this.customerName = customerName;
		this.contactNo = contactNo;
		this.location = location;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
