package com.spring;

public class Tyre {
	
	private String tyreSize;
	private String tyreBrand;
	public String getTyreSize() {
		return tyreSize;
	}
	public void setTyreSize(String tyreSize) {
		this.tyreSize = tyreSize;
	}
	public String getTyreBrand() {
		return tyreBrand;
	}
	public void setTyreBrand(String tyreBrand) {
		this.tyreBrand = tyreBrand;
	}
	@Override
	public String toString() {
		return "Tyre [tyreSize=" + tyreSize + ", tyreBrand=" + tyreBrand + "]";
	}

	
}
