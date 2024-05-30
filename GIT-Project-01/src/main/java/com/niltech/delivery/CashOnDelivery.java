package com.niltech.delivery;

public class CashOnDelivery {
	
	
	public String isDeliyere() {
		return "yes";
	}
	

	public String reverse(String name) {
		StringBuffer sb=new StringBuffer(name);
		return sb.reverse().toString();
	}

	public int findLength(String name) {
		System.out.println("Bug 123 is going on...");
		return name.length();
	}
}
