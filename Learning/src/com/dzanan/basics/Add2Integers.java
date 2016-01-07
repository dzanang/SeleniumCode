package com.dzanan.basics;

import acm.program.*;

public class Add2Integers extends ConsoleProgram{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void run(){
		println("This program adds two numbers.");
		int n1 = readInt("Enter n1: ");
		int n2 = readInt("Enter n2: ");
		int total = n1 + n2;
		println("The total is " + total + ".");
	}

}
