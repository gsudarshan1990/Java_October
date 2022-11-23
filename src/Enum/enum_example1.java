/**
 * 
 */
package Enum;

/**
 * @author s.m.govindarajan
 *
 */
public class enum_example1 {

	/**
	 * @param args
	 */
	
	enum season
	{
		Winter, Summer, Rainy, Fall
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		season myvar=season.Fall;
		
		System.out.println(myvar);
		
		myvar=season.Winter;
		System.out.println(myvar);
		
		myvar=season.Fall;
		System.out.println(myvar);
	
	}

}
