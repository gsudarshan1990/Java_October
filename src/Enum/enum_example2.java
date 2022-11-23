/**
 * 
 */
package Enum;

import java.util.Scanner;

/**
 * @author s.m.govindarajan
 *
 */
public class enum_example2 {

	/**
	 * @param args
	 */
	
	enum Car
	{
		TATA("TATA"), SUZUKI("Suzuki"), TOYOTA("Toyota"), HONDA("Honda"), KIA("Kia"),;
		
		private String description;

		Car(String string) {
			// TODO Auto-generated constructor stub
		
			this.description = string;
			
		}
		public String getDescription()
		{
			return description;
		}
	}
	
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the car type");
		String value = sc.nextLine();
		
		Car myvar=Car.TATA;
		if(myvar.description.equalsIgnoreCase(value))
		{
			System.out.println("Car is Tata");
		}
		else
		{
			System.out.println("Car is not tata");
		}
		
	}

}
