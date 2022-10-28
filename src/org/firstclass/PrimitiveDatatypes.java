/**
 * 
 */
package org.firstclass;

/**
 * @author s.m.govindarajan
 *
 */
public class PrimitiveDatatypes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte a = 10;
		int b = 20000;
		short c = 31931;
		long l = 2343242342342342331l;
		
		double d = 2.309;
		float f = 124.04f;

		
		char g ='b';
		char h ='e';
		
		boolean t = true;
		boolean fa = false;
		
		
		String k = "Kapil";
		String k1 = new String("Kapil Dev");
		
		System.out.println(k instanceof String);
		System.out.println(k1 instanceof String);
		
		System.out.println(k.getClass());
		
		String i= "10";
		Integer n = Integer.parseInt(i);
		
		System.out.println(n.getClass());
		
		
		System.out.println(System.identityHashCode(k));
		
		String w = "Hello";
		String x = new String("Hello");
		
		System.out.println(System.identityHashCode(w));
		System.out.println(System.identityHashCode(x));
		
		
		int y= 30;
		boolean z;
		if (z=(y<10))
		{
			
			System.out.println(y);
		}
		System.out.println(z);
	}

}
