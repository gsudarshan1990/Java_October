/**
 * 
 */

package org.staticexamples;

/**
 * @author s.m.govindarajan
 *
 */

class ExampleOFStatic
{
	static int a = 10;
	
	public static void staticfunction()
	{
		System.out.println("This is an example of static fucntion");
	}
	
	static
	{
		System.out.println("This is a static block");
	}
	
	
}

public class StaticExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExampleOFStatic.staticfunction();

		System.out.println(ExampleOFStatic.a);

	}

}
