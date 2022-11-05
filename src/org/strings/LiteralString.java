/**
 * 
 */
package org.strings;

/**
 * @author s.m.govindarajan
 * 
 * Description : Generate the two literal string and find the identityHashCose()

Example
 *
 */
public class LiteralString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String first = "Hello";
		String second = "Hello";
		
		System.out.println(System.identityHashCode(first));
		System.out.println(System.identityHashCode(second));

	}

}
