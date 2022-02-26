package com.info.iterator;

import java.util.ArrayList;

public class SmartCities {
	
	ArrayList<String> cityList;
	 
	public SmartCities() {
		cityList = new ArrayList<String>();
		addItem("Chennai");
		addItem("Delhi");
		addItem("Bangalore");
		addItem("Mumbai");
	}

	public void addItem(String name)
	{
		cityList.add(name);
	}
 
	public ArrayList<String> getCompanyList() {
		return cityList;
	}
  
	public Iterator createIterator() {
		return new SmartCityIterator(cityList);
	}
  
	public String toString() {
		return "Smart Cities List";
	}

}
