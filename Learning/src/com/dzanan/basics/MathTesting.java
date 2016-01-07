package com.dzanan.basics;

import com.azem.pow.Adress;
import com.azem.pow.Prisoner;

public class MathTesting {
	public static void main(String[] args) {
		Math mathInstance = new Math();
		System.out.println(mathInstance.add(5, 5));
		System.out.println(new Math().substract(10, 5));
		System.out.println(mathInstance.multiply(3, 5, 2));
		System.out.println(mathInstance.add(mathInstance.multiply(5, 5, 5), mathInstance.substract(10, 5)));
		System.out.println((3 + 2) * 5);
		System.out.println(mathInstance.addPositive(5, 0));
		System.out.println(mathInstance.smartSubstract(5, 5));

		NumberPrinter numberInstance = new NumberPrinter();
		numberInstance.positivePrint(5);

		System.out.println(5 % 3);
		System.out.println(mathInstance.isEven(5));
		System.out.println(mathInstance.triplets());

	
			
		Person personInstance = new Person("Kenan","Hrnjic", 30, "BiH");
		personInstance.completeInfo();
		
		Car carInstance = new Car("Mazda", 2005, "Red", false);
		carInstance.printInfo();
		
		Prisoner prisonerInstance = new Prisoner();
		prisonerInstance.getFirstName();
		Mathss mathsInstance = new Mathss();
		System.out.println(mathsInstance.y);
		mathsInstance.ifLoop();
		
		{
			
			if (mathsInstance.y == 2.5){
				System.out.println("Well done.!");
			}

			}
		
	}
}
