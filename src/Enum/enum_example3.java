/**
 * 
 */
package Enum;

/**
 * @author s.m.govindarajan
 *
 */
public class enum_example3 {

	/**
	 * @param args
	 */
	
	enum days
	{
		Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		days weekdays, weekends;
		
		weekdays = days.Monday;
		
		weekends = days.Saturday;
		
		System.out.println(weekdays);
		System.out.println(weekends);
		
		days anotherweekday = days.Wednesday;
		
		System.out.println(anotherweekday);
		
		
	}

}
