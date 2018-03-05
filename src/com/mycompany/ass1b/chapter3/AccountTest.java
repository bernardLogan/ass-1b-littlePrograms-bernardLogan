/**
 * 
 */
package com.mycompany.ass1b.chapter3;

import java.util.Scanner;

/**
 * @author berna
 *
 */
public class AccountTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Account acc1 = new Account("Joe", 10000.00);
      Account acc2 = new Account("Sandra", 400.00);
      System.out.println(acc1.getName() + " balance: " + acc1.getBalance());
      System.out.println(acc2.getName() + " balance: " + acc2.getBalance());
      Scanner input = new Scanner(System.in);
      //Account 1
      System.out.println("Enter deposit amount: " );
      double deposit = input.nextDouble();
      System.out.println("Adding " + deposit + " deposit into Account1");
      acc1.deposit(deposit);
      
      System.out.println("Account1 balance: " + acc1.getBalance());
      
      System.out.println("Enter withdraw amount: " );
      double withdraw = input.nextDouble();
      System.out.println("Withdrawing " + withdraw + " deposit into Account1");
      acc1.withdraw(withdraw);
      ;
      System.out.println("Account Name: " + acc1.getName() + " Account1 balance: " + acc1.getBalance());
      
      //Account 2
      System.out.println("Enter deposit amount: " );
      deposit = input.nextDouble();
      System.out.println("Adding " + deposit + " deposit into Account2");
      acc2.deposit(deposit);
      
      System.out.println("Account1 balance: " + acc1.getBalance());
      
      System.out.println("Enter withdraw amount: " );
      withdraw = input.nextDouble();
      System.out.println("Withdrawing " + withdraw + " deposit into Account2");
      acc2.withdraw(withdraw);
      
      System.out.println("Account Name: " + acc2.getName() + " Account1 balance: " + acc2.getBalance());
      input.close();
	}

}
