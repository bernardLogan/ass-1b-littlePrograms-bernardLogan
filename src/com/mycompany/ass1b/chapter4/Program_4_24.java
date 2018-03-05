/**
 * 
 */
package com.mycompany.ass1b.chapter4;

import java.util.Scanner;

/**
 * @author berna
 *
 */
public class Program_4_24
{
public static void main(String[] args)
{
// create Scanner to obtain input from command window
Scanner input = new Scanner(System.in);
int passes = 0;
int failures = 0;
int studentCounter  = 1;
int result;
//process 10 students using counter-controlled loop
while (studentCounter <= 10 )
{

System.out.print("Enter result (1 = pass, 2 = fail): ");
result = input.nextInt();
//initializing variables in declarations
//if...else is nested in the while statement
if (result == 1)
passes = passes + 1;
else if(result == 2) {
failures = failures + 1; 
}
else {
	
System.out.print("Invalid!");

}
studentCounter = studentCounter + 1;
}
System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
if (passes > 8)
System.out.println("Bonus to instructor!");
//termination phase; prepare and display results





}
} // end class Analysis