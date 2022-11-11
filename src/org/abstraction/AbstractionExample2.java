/**
 * 
 */
package org.abstraction;

/**
 * @author s.m.govindarajan
 * 
 * This is an example of the abstraction
 *
 */


abstract class WashingMachine
{
	
	public WashingMachine()
	{
		System.out.println("This is a abstract class constructor");
	}
	public void print()
	{
		System.out.println("This is a non abstract method");
	}
	
	abstract public void dryrequire();
	String name = "washing machine1";
}

class latestWashingMachine extends WashingMachine
{

	@Override
	public void dryrequire() {
		// TODO Auto-generated method stub
		System.out.println("The Drying is in built");
	}
	
}


class OldWashingMachine extends WashingMachine
{

	@Override
	public void dryrequire() {
		// TODO Auto-generated method stub
		System.out.println("The drying is not in built");
		
	}
	
}

public class AbstractionExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		latestWashingMachine lwm = new latestWashingMachine();
		lwm.print();
		lwm.dryrequire();
		
		OldWashingMachine owm = new OldWashingMachine();
		owm.print();
		owm.dryrequire();
		


	}

}
