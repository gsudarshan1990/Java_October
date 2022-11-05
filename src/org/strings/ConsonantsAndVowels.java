/**
 * 
 */
package org.strings;

import java.util.Scanner;

/**
 * @author s.m.govindarajan
 *
 */
public class ConsonantsAndVowels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch;
		int vowels=0, consonants=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		
		String word = sc.nextLine();
		
		char[] letters = word.toCharArray();
		
		for(int i =0;i<letters.length;i++)
		{
			ch = letters[i];
			
			if( ch == 'a' || ch =='e'|| ch == 'i' || ch == 'o' || ch == 'u')
			{
				vowels++;
			}
			else if ( ch > 'a' && ch <'z')
			{
				consonants++;
			}
			
		}
		System.out.println("Vowels "+vowels);
		System.out.println("Consonants"+consonants);
	}

}
