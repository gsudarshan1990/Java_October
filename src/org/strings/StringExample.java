package org.strings;
/**
 * 
 */

/**
 * @author s.m.govindarajan
 *
 */
public class StringExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Hello world";
		
		String firstname = new String("Japan");
		
		System.out.println(name.getClass());
		
		System.out.println("The string length is "+name.length());
		
		String string1 ="Hello";
		
		String string2 ="World";
		
		System.out.println(string1+" "+string2);
		
		System.out.println(string1.concat(" "+string2));
		
		String string3 = "Hello";
		
		System.out.println(string1.equals(string2));
		
		System.out.println(string1.equals(string3));
		
		String string4 ="hello";

		System.out.println(string3.equals(string4));
		
		System.out.println(string3.equalsIgnoreCase(string4));
		
		String string5 = "hello what are you doing";
		
		System.out.println(string5.toUpperCase());
		
		String string6 ="GOOD JOB";
		
		System.out.println(string6.toLowerCase());
		
		System.out.println(string6.charAt(5));
		
		System.out.println(string5.substring(8));
		
		System.out.println(string5.substring(6, 15));
		
		String string7 ="adventure";
		
		System.out.println(string7.compareTo("zoo"));
		
		System.out.println(string7.compareTo("adventure"));
		
		System.out.println("zoo".compareTo(string7));
		
		String string8 ="advocate";
		
		System.out.println(string7.compareTo(string8));
		
				

	}

}
