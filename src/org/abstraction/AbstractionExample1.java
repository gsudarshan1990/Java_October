/**
 * 
 */
package org.abstraction;

/**
 * @author s.m.govindarajan
 *
 */

/*
 * This is used for the abstraction
 */


abstract class Laptop
{
	
	abstract public void screen();
	public void keyboard()
	{
		System.out.println("This contains the english keyboard");
	}
}

class Lenovo extends Laptop
{

	@Override
	public void screen() {
		// TODO Auto-generated method stub
		
		System.out.println("This screen is of type OLED");
		
	}
	
}

class Acer extends Laptop
{

	@Override
	public void screen() {
		// TODO Auto-generated method stub
		System.out.println("This screen is of type LED");
		
	}
	
}



public class AbstractionExample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Lenovo l = new Lenovo();
		l.screen();
		l.keyboard();
		
		Acer  a = new Acer();
		a.screen();
		a.keyboard();
		
		Laptop lp = new Laptop() {
			
			@Override
			public void screen() {
				// TODO Auto-generated method stub
				System.out.println("This belongs to generic laptop");
			}
		};

		lp.screen();
	}

}
