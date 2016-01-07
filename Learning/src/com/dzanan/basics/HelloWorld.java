package com.dzanan.basics;

public class HelloWorld {
	public static void main(String[] args) {
		//System.out.println("Merhaba Svite");
		
		Cat catInstance = new Cat("Miki");
		
		catInstance.meow();
		
		catInstance.intro();
		
	
	
	System.out.println(catInstance.myName());
	}
	
}
