/**
 * 
 */
package org.polymorphism;

/**
 * @author s.m.govindarajan
 *
 */
/*
 * Overriding
 */


class Machine
{
	public void purpose()
	{
		System.out.println("The purpose of this machine is to work");
	}
	
	public void delete()
	{
		System.out.println("This is the sample to delete");
	}
	
}


class WashingMachine extends Machine
{
	@Override
	public void purpose()
	{
		System.out.println("The purpose of washing machine is to wash close");
	}
}


class DryingMachine extends Machine
{
	@Override
	public void purpose()
	{
		System.out.println("The purpose of washing machine is to dry close");
	}
	
}

public class OverRiding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Machine m = new Machine();
		m.purpose();
		
		WashingMachine w = new WashingMachine();
		w.purpose();
		
		DryingMachine d = new DryingMachine();
		d.purpose();
		
		Machine m1 = new DryingMachine();
		System.out.println("======");
		m1.purpose();
		System.out.println("=====");
		m1.delete();
		
	}

}
