/**
 * 
 */
package org.blocks;

/**
 * @author s.m.govindarajan
 * 
 * This is an example of static block
 *
 */
public class StaticBlockExample {

	/**
	 * @param args
	 * 
	 */
	
	static
	{
		System.out.println(" This is the first static block");
	}
	
	static 
	{
		System.out.println("This is the second static block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is the main block");
	}

}
