/**
 * 
 */
package org.collections;

import java.util.Vector;

/**
 * @author s.m.govindarajan
 *
 */
public class VectorExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Vector<String> v = new Vector();
		v.add("dog");
		v.add("Cat");
		v.add("lion");
		v.add("rat");
		
		v.add(1,"pig");
		System.out.println(v);
		
		Vector<String> v2 = new Vector();
		v2.add("dinosaur");
		v2.add("giraffee");
		System.out.println(v2);
		v2.addAll(v);
		System.out.println(v2);
		v.remove(0);
		v.remove("rat");
		
		Vector<String> v3 = new Vector();
		v3.add("dog");
		v3.add("dinosaur");
		v2.removeAll(v3);
		System.out.println(v2);
		
		v3.clear();
		System.out.println(v3);
		

	}

}
