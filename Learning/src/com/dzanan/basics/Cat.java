package com.dzanan.basics;

public class Cat {
	// Member variables
	private int age;
	private String name;
	
	// Constructor
	public Cat(String name) {
		this.name = name;
	}
	
	// Methods
	public void meow(){
		System.out.println("Meow");
	}
	
	public void intro(){
		System.out.println(name);
	}
	
	public String myName(){
		return name;
	}
}
