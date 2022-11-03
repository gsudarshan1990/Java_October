package org.controlstatements;

import java.util.Scanner;

public class ControlStatementsPartTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		for(int i =0;i<50;i++)
//		{
//			System.out.println(i);
//		}
		
//		int i =0;
//		
//		while(i<50)
//		{
//			System.out.println(i);
//			i++;
//		}
//		
//		int m = 1;
//		
//		while(m<5)
//		{
//			System.out.println(m);
//			m++;
//		}
//		
//		int n = 1;
//		do
//		{
//			System.out.println(n);
//			n++;
//		}while(n<10);
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of the month");
		
		String Month_Name = sc.next();
		
		switch(Month_Name)
		{
		case "JAN":System.out.println("This is January Month");
						break;
		case "FEB":System.out.println("This is February Month");
						break;
		case "MAR":System.out.println("This is March Month");
						break;	
		default: System.out.println("This is not a month");
		}
		
	}

}
