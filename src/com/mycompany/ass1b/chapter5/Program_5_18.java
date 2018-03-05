package com.mycompany.ass1b.chapter5;

public class Program_5_18 {

	public static void main(String[] args) {
		int amount;
		int principal = 1000;
		int rate = 5;
		int cents;
		int dollar;
		System.out.println( "Year\n"+ "Amount on deposit\n" );
		 
		for ( int year = 1; year <= 10; year++ )
	        {
	           
			  amount = (principal * (int)Math.pow(1.0 + rate, year)) * 100;
	          cents = amount % 100;
	          dollar = amount/1000;
	            
			  System.out.println("Year" + " " + year + ": "  + dollar + "." +  cents);
	        } 
	}

}
