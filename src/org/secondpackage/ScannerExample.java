package org.secondpackage;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		
		System.out.println("Enter the integer values");
		
		int b = S.nextInt();
		System.out.println(b);		
		String g= S.next();
		System.out.println(g);
			
	}	
	
}
