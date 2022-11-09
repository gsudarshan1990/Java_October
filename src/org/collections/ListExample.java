/**
 * 
 */
package org.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author s.m.govindarajan
 *
 */
public class ListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		List<Integer> l2 = new LinkedList<Integer>();
//		List<Integer> l3 = new ArrayList<Integer>();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.add(10);
		ll.add(20);
		ll.add(30);
		
		System.out.println(ll);
		
		ll.addFirst(0);
		ll.addLast(40);
		
		ll.add(5,50);
		
		System.out.println(ll);
		
	}

}
