package com.info.observer;

import com.info.bean.Guest;

public interface Observer {
	
	public void registerUser(Guest customers);
	
	public void notifyUser(String msg,String custName);

}
