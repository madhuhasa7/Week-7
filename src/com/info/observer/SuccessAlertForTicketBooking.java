package com.info.observer;

import com.info.bean.Guest;

public class SuccessAlertForTicketBooking {
	
	
   Users users = new Users();
   
   public void RegisterUser(Guest customer) {
	   users.registerUser(customer);
   }
   
   public void sendOfferNotification(Guest customer) {
	   users.notifyUser("Ticket Booked successfully for the location "+ 
                       customer.getLocation() +" to Mr." , customer.getCustomerName());
   }
   


}
