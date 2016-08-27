package com.touid.com.defaultInterface;



public class Esample2 {

	  public static void main(String[] args) {
	//The formula is implemented as an anonymous object
		  Formula formula=new Formula() {
			
			@Override
			public double calculate(int a) {
				
				return sqrt(a);
			}
		};
		
		System.out.println(formula.calculate(25));
		System.out.println(formula.sqrt(36));
	}
}

interface Formula{
	
	double calculate(int a);
	default double sqrt(int a){
		return Math.sqrt(a);
	}
}


