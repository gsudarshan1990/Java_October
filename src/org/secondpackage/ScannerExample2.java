/**
 * 
 */
package org.secondpackage;

import java.util.Scanner;

/**
 * @author s.m.govindarajan
 *
 */

/*
Using Scanner class get the below details
empId
empName
empEmail
empPhoneno
empSalary
empGender
empCity
*/
public class ScannerExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		
		
		System.out.println("Enter the Employee ID");
		
		int empID = S.nextInt();
		
		System.out.println("Enter the Employee Name");
		
		String empName = S.next();
		
		System.out.println("Enter the Employee Email");
		
		String empEmail = S.next();
		
		System.out.println("Enter the Employee Phoneno as long");
		long empPhoneno = S.nextLong();
		
		
		System.out.println("Enter the Employee Salary");
		double empSalary = S.nextDouble();
		
		System.out.println("Enter the Employee Gender");
		String empGender = S.next();
		
		System.out.println("Enter the Employee City");
		String empCity = S.next();
		
		System.out.println(empID);
		
		System.out.println(empName);
		

		System.out.println(empEmail);

		System.out.println(empPhoneno);
		
		System.out.println(empSalary);
		

		System.out.println(empGender);
		

		System.out.println(empCity);
	}
	
	

}
