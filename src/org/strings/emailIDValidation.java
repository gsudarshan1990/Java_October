/**
 * 
 */
package org.strings;

import java.util.Scanner;

/**
 * @author s.m.govindarajan
 * 
 * Description: Get the email id from the user and verify '@' is present or not?
 *
 */
public class emailIDValidation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the email address");
		
		String emailID = sc.next();
		
		if(emailID.contains("@"))
		{
			System.out.println("email address is valid");
		}
		else
		{
			System.out.println("Email address is not valid");
		}
				
	}

}
