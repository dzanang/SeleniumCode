package com.dzanan.basics;

public class Math {
	public int add(int a, int b) {
		return a + b;
	}

	public int substract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b, int c) {
		return a * b * c;
	}

	public int addPositive(int a, int b) {
		if (a > 0 && b > 0) {
			return a + b;
		} else {
			return 0;
		}
	}

	public int smartSubstract(int a, int b) {
		if (a > b) {
			return a - b;
		} else if (a < b) {
			return b - a;
		} else {
			return 0;
		}

	}

	public boolean isDivisible(int a, int b) {
		if (a % b == 0) {
			return true;
		}
		return false;
	}

	public boolean isEven(int a) {
		return (a % 2 == 0);
	}

	public int triplets() {
		int a;
		int suma = 0;
		for (a = 0; a < 1000; a++) {
			if (a % 3 == 0 || a % 5 == 0) {
				suma = suma + a;
				
			}

		}
		return suma;
			}
	
}
