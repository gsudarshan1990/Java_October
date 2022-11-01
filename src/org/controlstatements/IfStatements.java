/**
 * 
 */
package org.controlstatements;

import java.util.Scanner;

/**
 * @author s.m.govindarajan
 *
 */
public class IfStatements {

	/**
	 * @param args
	 */

	public int a;
	public int b;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner Sc = new Scanner(System.in);
		IfStatements i = new IfStatements();
		System.out.println("Enter the first value");
		i.a = Sc.nextInt();
		System.out.println("Enter the second value");
		i.b = Sc.nextInt();
		
		int c = i.a+i.b;
		
		boolean d = c>50;
				
		System.out.println(d);
		
		
		
//		if(c>50)
//		{
//			System.out.println("The addition is greater than 50");
//		}
		
//		if(c>50)
//		{
//			System.out.println("The addition is greater than 50");
//		}
//		else
//		{
//			System.out.println("The addition is less than 50");
//		}
		
		
		//nested if
//		if(c>50)
//		{
//			if(c>60)
//			{
//				System.out.println("The addition is greater than 50 and 60");
//			}
//			System.out.println("The addition is greater than 50");
//		}
		
		
		// if else ladder
		
		if(c>50)
		{
			System.out.println("The addition is greater than 50");
		}
		else if( c>40)
		{
			System.out.println("The addition is greater than 40");
		}
		else if( c>30)
		{
			System.out.println("The addition is greater than 30");
		}
		else 
		{
			System.out.println("The addition is lesser than 30");
		}
	}	
	

}
