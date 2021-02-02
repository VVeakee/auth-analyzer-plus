package com.protect7.authanalyzer.entities;

public enum AutoExtractLocation {

	COOKIE("Cookie"), 
	HTML("HTML Document"), 
	JSON("JSON Object");

	private final String name;

	public String getName() {
		return this.name;
	}

	private AutoExtractLocation(String name) {
		this.name = name;
	}
	
}
