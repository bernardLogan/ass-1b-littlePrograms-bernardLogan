/**
 * 
 */
package com.mycompany.ass1b.chapter2;

import java.util.Scanner;

/**
 * @author berna
 *
 */
public class Program_2_6 {

	public static void main(String [] args )
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number: " );
		int num1 = input.nextInt();
		System.out.println("Enter second number: ");
		int num2 = input.nextInt();
		System.out.println("Enter third number");
		int num3 = input.nextInt();
		System.out.println("Product: " + (num1 * num2 * num3));
	}
}
