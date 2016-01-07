package com.dzanan.basics;

public class Person {
	private String name;
	private Age age;
	private  Drzava country;
	private String prezime;

	public Person(String personsName, String personsPrezime, int personsAge, String personsDrzava) {
		name = personsName;
		prezime = personsPrezime;
		age = new Age (personsAge);
		country = new Drzava(personsDrzava);
	}

	public void printName() {
		System.out.println(name);
	}

	public void pirntAge() {
		System.out.println(age);
	}

	public void printInfo() {
		System.out.println(name);
		age.printAge();
		country.printDrzava();
	}

	public void completeInfo() {
		System.out.println(
				"Ja se zovem " + name + " " + prezime + ". Imam " + age.age + " godina i dolazim iz " + country.nazivDrzave + ".");
	}

}
