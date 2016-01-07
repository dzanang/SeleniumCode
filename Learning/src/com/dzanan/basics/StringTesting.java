package com.dzanan.basics;

public class StringTesting {
	public static void main(String[] args) {
		String jasmin = "Jasmin";
		System.out.println(jasmin);
		String dzanan = "Dzanan";
		System.out.println(dzanan);
		String jasminAndDzanan = jasmin + " " + dzanan;
		System.out.println(jasminAndDzanan);
		StringUtils connect = new StringUtils();
		jasminAndDzanan = connect.concatStrings(jasmin, dzanan);
		System.out.println(jasminAndDzanan);
		
	}
}
