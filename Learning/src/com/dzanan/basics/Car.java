package com.dzanan.basics;

public class Car {
	String carType;
	int age;
	Color boja;

	public Car(String newType, int prodAge, String bojaAuta, Boolean isMetalic) {
		carType = newType;
		age = prodAge;
		boja = new Color(bojaAuta, isMetalic);
	}

	public void printInfo() {
		if (boja.metalic == true) {
			System.out.println("Ja vozim auto marke" + carType + " proizveden" + age + " godine. Boje" + boja.boja
					+ " i ona je metalic.");
		} else {
			System.out.println("Ja vozim auto marke" + carType + " proizveden" + age + " godine. Boje" + boja.boja
					+ " i ona nije metalic.");
		}
	}
}
