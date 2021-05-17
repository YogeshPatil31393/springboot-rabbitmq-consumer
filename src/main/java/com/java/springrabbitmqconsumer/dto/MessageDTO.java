package com.java.springrabbitmqconsumer.dto;

public class MessageDTO {

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "MessageDTO [value=" + value + "]";
	}
	
	
	
	
}
