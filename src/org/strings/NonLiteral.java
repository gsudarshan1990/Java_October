/**
 * 
 */
package org.strings;

/**
 * @author s.m.govindarajan
 *
 */
public class NonLiteral {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String first = new String("Hello");
		String second = new String("Hello");
		
		System.out.println(System.identityHashCode(first));
		System.out.println(System.identityHashCode(second));

	}

}
