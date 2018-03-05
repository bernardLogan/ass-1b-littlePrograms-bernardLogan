/**
 * 
 */
package com.mycompany.ass1b.chapter2;

import java.util.Scanner;

/**
 * @author berna
 *
 */
public class Program_2_15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number: " );
		int num1 = input.nextInt();
		System.out.println("Enter second number: ");
		int num2 = input.nextInt();
		System.out.println("Sum: " + sum(num1, num2) + "\n" + 
		"Product: " + product(num1, num2) + "\n" 
        + "Difference: " + difference(num1, num2) + "\n" + "Quotient:" + quotient(num1, num2));
		input.close();

	}
	
	public static int sum (int x, int y)
	{
		return (x + y);
	}
	
	public static int product (int x, int y)
	{
		return (x * y);
	}
	
	public static int difference (int x, int y)
	{
		return (x - y);
	}
	
	public static float quotient (int x, int y)
	{
		return (x / y);
	}



}
