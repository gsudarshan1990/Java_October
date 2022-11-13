/**
 * 
 */
package org.staticexamples;

/**
 * @author s.m.govindarajan
 *
 */

class Counter
{
	static int count = 0;
	int count_second = 0;

	public Counter()
	{
		System.out.println("This is a counter constructor");
		count++;
		count_second++;
	}
	
}


public class StaticIncrement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		System.out.println(c1.count);
		System.out.println(c2.count);
		System.out.println(c3.count);
		System.out.println(Counter.count);
		System.out.println(c1.count_second);
		System.out.println(c2.count_second);
		System.out.println(c3.count_second);
		
	}

}
