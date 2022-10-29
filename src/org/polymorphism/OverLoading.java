/**
 * 
 */
package org.polymorphism;

/**
 * @author s.m.govindarajan
 *
 */
/*
 * Example of Overloading
 */

public class OverLoading {

	/**
	 * @param args
	 */
	
	public void add(int a, int b)
	{
		int sum = a+b;
		System.out.println(sum);
	}
	
	
	public void add()
	{
		int a = 101;
		int b =10;
		int sum = a+b;
		
		System.out.println(sum);
		
	}
	
	
	public void add(double a, double b)
	{
		double sum = a+b;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverLoading o = new OverLoading();
		o.add();
		o.add(5.309, 6.091);
		o.add(4,10);

	}

}
