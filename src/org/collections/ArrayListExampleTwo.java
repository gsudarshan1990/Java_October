/**
 * 
 */
package org.collections;

import java.util.ArrayList;

/**
 * @author s.m.govindarajan
 *
 */
public class ArrayListExampleTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String>();
		

		System.out.println(al.isEmpty());
		
		al.add("Hello");
		al.add("How");
		al.add("what");
		System.out.println(al);
		al.set(0, "Good morning");
		
		System.out.println(al.isEmpty());
		System.out.println(al);
		
		al.add(0,"Sir");
		
		System.out.println(al);
		
	
	}

}
