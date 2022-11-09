/**
 * 
 */
package org.collections;

import java.util.ArrayList;

/**
 * @author s.m.govindarajan
 *
 */
public class ArrayListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a = new ArrayList();
		
		a.add(10);
		a.add("Hello");
		a.add(3.2f);
		
		for(int i =0; i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
	}

}
