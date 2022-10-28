/**
 * 
 */
package org.Inheritance;

import java.util.Scanner;

/**
 * @author s.m.govindarajan
 *
 */

/*
 * Covers
 * Inheritance
 * Access Specifiers
 * DataTypes
 * Scanner 
 * 
 */


class Vehicle
{
	private int VehicleNo;
	public String VehicleType;
	
	public Vehicle(int number1)
	{
		VehicleNo = number1;
	}
		
	public void printStatementForVehicle()
	{
		System.out.println("Vehicle Type is "+VehicleType);
	}
	
	public void printVehicleNo()
	{
		System.out.println("Vehicle Number is "+VehicleNo);
	}
}


class RoadVehicle extends Vehicle
{
	public String RoadType;
	
	public RoadVehicle()
	{
		super(102);
	
	}
	
	public void printStatement1()
	{
		System.out.println("Road Type is "+RoadType);
	}
	
}


class Car extends RoadVehicle
{
	public String CarType;
	private int CarNumber;
	
	public void printStatemeent2()
	{
		System.out.println("CarType is "+CarType);
	}
}


class Bus extends RoadVehicle
{
	public String busType;
	private int busNumber;
	
	public void printStatemeent2()
	{
		System.out.println("BusType is "+busType);
	}
	
}

public class AdvancedInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner S = new Scanner(System.in);
		RoadVehicle R = new RoadVehicle();
		
		System.out.println("Enter the Vehicle Name");
		
		String vehicleType1 = S.next();
		
		R.VehicleType = vehicleType1;
		
		R.printStatementForVehicle();
		R.printVehicleNo();
		
		Bus b = new Bus();
		b.busType = "multi-axle";
		b.printStatemeent2();
		b.printStatement1();
		
		
	}

}
