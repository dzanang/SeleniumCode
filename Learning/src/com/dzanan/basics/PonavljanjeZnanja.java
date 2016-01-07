package com.dzanan.basics;

public class PonavljanjeZnanja {
	public void isEven(int i) {
		if (i % 2 == 0) {
			System.out.println("Broj je paran.");
		}
	}

	public String isEveen(int i) {
		if (i % 2 == 0) {
			String result = "Broj je paran";
			result = new String("Broj je paran.");
			return result;
		} else {
			return "Broj nije paran";
		}
	}
}
