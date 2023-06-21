package com.spring;

import org.springframework.stereotype.Component;

@Component
public class Tyres {
	private String tyreBrand;

	public String getTyreBrand() {
		return tyreBrand;
	}

	public void setTyreBrand(String tyreBrand) {
		this.tyreBrand = tyreBrand;
	}

	@Override
	public String toString() {
		return "It's working";
	}
	
	

}
