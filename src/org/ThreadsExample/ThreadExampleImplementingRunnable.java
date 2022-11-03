/**
 * 
 */
package org.ThreadsExample;

/**
 * @author s.m.govindarajan
 *
 */

class PrintHelloWorld implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("Hello World");
		System.out.println("The name of the thread is "+Thread.currentThread().getName());
	}
}


public class ThreadExampleImplementingRunnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintHelloWorld phw = new PrintHelloWorld();
		
		Thread t = new Thread(phw);
		
		t.start();
		System.out.println("This thread is "+Thread.currentThread().getName());
		

	}

}
