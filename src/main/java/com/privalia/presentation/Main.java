package com.privalia.presentation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Polimorfismo de interfaces
		ICalculator calculator = new Calculator();
		System.out.println(calculator.sum(4, 4));

	}

}
