package com.info.iterator;

import java.util.ArrayList;

public class SmartCityIterator implements Iterator {

	ArrayList<String> cities;
	int position = 0;
 
	public SmartCityIterator(ArrayList<String> cities) {
		this.cities = cities;
	}
 
	public String next() {
		String menuItem = (String) cities.get(position);
		position = position + 1;
		return menuItem;
	}
 
	public boolean hasNext() {
		if (position >= cities.size()) {
			return false;
		} else {
			return true;
		}
	}

}
