package com.spring;

public class Windows {
	private String windowColour;
	private String windowBrand;
	public Windows(String windowColour, String windowBrand) {
		super();
		this.windowColour = windowColour;
		this.windowBrand = windowBrand;
	}
	@Override
	public String toString() {
		return "Windows [windowColour=" + windowColour + ", windowBrand=" + windowBrand + "]";
	}
	
	
     
}
