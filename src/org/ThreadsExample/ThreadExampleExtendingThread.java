/**
 * 
 */
package org.ThreadsExample;

/**
 * @author s.m.govindarajan
 *
 *
 */

class PrintWorld extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Hello world");
		System.out.println(Thread.currentThread().getName());
		
	}
}

public class ThreadExampleExtendingThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintWorld pw = new PrintWorld();
		pw.start();
		System.out.println(Thread.currentThread().getName());

	}

}
