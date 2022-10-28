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
 * Using Scanner class get the below details
             studentId
             studentName
             Mark1
             Mark2
             Mark3
             Mark4
             Mark5
           :Find the total and average of marks
 */

public class ScannerExample3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner S = new Scanner(System.in);
		
		System.out.println("Enter the Student Id");
		
		String studentId = S.next();
		
		System.out.println("Enter the Student name");
		
		String studentName = S.next();
		
		System.out.println("Enter the Student Mark1");
		
		int Mark1 = S.nextInt();
		
		
		System.out.println("Enter the Student Mark2");
		
		int Mark2 = S.nextInt();
		
	
		
		System.out.println("Enter the Student Mark3");
		
		int Mark3 = S.nextInt();
		
		
		System.out.println("Enter the Student Mark4");
		
		int Mark4 = S.nextInt();
		
		
		System.out.println("Enter the Student Mark5");
		
		int Mark5 = S.nextInt();
				
		int Sum1 = Mark1+Mark2+Mark3+Mark4+Mark5;
		
		float average = (Sum1)/5.0f;
		
		System.out.println(studentId);
		System.out.println(studentName);
		System.out.println(average);
	
		System.out.println();
		System.out.println();
		
	}

}
