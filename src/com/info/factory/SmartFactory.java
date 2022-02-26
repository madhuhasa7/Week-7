package com.info.factory;

import com.info.service.Chennai;
import com.info.service.SmartCity;
import com.info.service.Trivandram;

public class SmartFactory {

	public SmartCity selectCity(String city) {
		if (city.equalsIgnoreCase("Chennai")) {
			return new Chennai();
		} else if (city.equalsIgnoreCase("Trivandram")) {
			return new Trivandram();
		}
		return null;
	}

}
