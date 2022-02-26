package com.info.observer;

import com.info.bean.Guest;

public class Users implements Observer{

	@Override
	public void notifyUser(String msg, String userName) {
		// TODO Auto-generated method stub
		System.out.println("******"+msg+" "+userName+" **********");
	}

	@Override
	public void registerUser(Guest customers) {
		// TODO Auto-generated method stub
		System.out.println("******Customer Registered "+ customers.getCustomerName()+"******");

	}
	
	
	

}
