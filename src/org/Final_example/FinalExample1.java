/**
 * 
 */
package org.Final_example;

/**
 * @author s.m.govindarajan
 *
 */


final class JawaVehicle
{
	public void purpose()
	{
		System.out.println("The purpose of this vehicle is to commute on the road");
	}
}

class WashingMachine
{
	final int value = 20000;
	
	public final void needs()
	{
		System.out.println("This us the Alternate Current from home");
	}
	
	public void DryingType()
	{
		System.out.println("This can have both in-built and non built drying type");
	}
}

class homewashing extends WashingMachine
{
	@Override
	public void DryingType()
	{
		System.out.println("This has only in built drying type ");
		
	}

}



public class FinalExample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
