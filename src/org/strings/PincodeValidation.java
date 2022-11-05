/**
 * 
 */
package org.strings;

import java.util.Scanner;

/**
 * @author s.m.govindarajan
 *
 *Description:Get the address from the user and verify "pincode" is present or not?
 *
 */
public class PincodeValidation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the residential address");
		
		String address = sc.nextLine();
		
		String[] addressarray = address.split(",");

		for(int i =0;i<addressarray.length;i++)
		{
			try
			{
				Integer.parseInt(addressarray[i]);
				System.out.println("Contains the pincode");
			}
			catch(Exception e)
			{
				continue;
			}
			
		}
		
	}

}
