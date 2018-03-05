/**
 * 
 */
package com.mycompany.ass1b.chapter4;

import com.mycompany.ass1b.chapter4.Program_4_4.Student;

/**
 * @author berna
 * Test for program 4.4
 */
public class StudentTest
{
public static void main(String[] args)
{
Student account1 = new Program_4_4().new Student("Jane Green", 90);
Student account2 =  new Program_4_4().new Student("John Blue", 72.75);

System.out.printf("%s's letter grade is: %s%n", account1.getName(), account1.getLetterGrade());
System.out.printf("%s's letter grade is: %s%n", account2.getName(), account2.getLetterGrade() );
}
} // end class StudentTest