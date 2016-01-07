package com.dzanan.basics;

public class NumberPrinter {
	public void positivePrint(int x) {
		if (x > 0) {
			System.out.println("The number " + x + " is positive.");

		}
	}

	public void negativePrint(int x) {
		if (x < 0) {
			System.out.println(x);
		}
	}

	public void largerNumber(int x, int y) {
		if (x > y) {
			System.out.println(x);
		} else {
			System.out.println(y);
		}
	}
}
