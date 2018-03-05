package com.mycompany.ass1b.chapter4;

import java.util.Scanner;

public class ClassAverage2
{
	// Figure 4.10
public static void main(String[] args)
{
//create Scanner to obtain input from command window
Scanner input = new Scanner(System.in);

// initialization phase
int total = 0; // initialize sum of grades
int gradeCounter = 0;

// processing phase
System.out.println("Enter grade 1 or -1 to quit: " );
int grade = input.nextInt();



while (grade != -1)
{
total = total + grade; // add grade to total
gradeCounter = gradeCounter + 1; // increment counter




}

// termination phase
// if user entered at least one grade...
if (gradeCounter !=0)
{
	double average = (double)total / gradeCounter;





// display total and average (with two digits of precision)
System.out.printf("%nTotal of the %d grades entered is %d%n",
gradeCounter, total);
System.out.printf("Class average is %.2f%n", average);
}
else // no grades were entered, so output appropriate message
System.out.println("No grades were entered");
}
} // end class ClassAverage
