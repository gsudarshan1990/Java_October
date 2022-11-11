/**
 * 
 */
package org.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @author s.m.govindarajan
 *
 *Duplicate in list
 *[1, 2, 3, 4, 2, 7, 8, 8, 3]; 
 */
public class DuplicateInList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> li = new LinkedList<Integer>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(2);
		li.add(7);
		li.add(8);
		li.add(8);
		li.add(3);
		System.out.println(li);
		
		
//		Iterator<Integer> itr=li.iterator();
//		
//		while(itr.hasNext())
//		{
//			non_duplicate.add(itr.next());
//		}
		
		Set<Integer> non_duplicate = new HashSet<>(li);
		
		
		List<Integer> l2 = new LinkedList<>(non_duplicate);
		System.out.println(l2);
		
	

		
		
//			Iterator<Integer> itr = non_duplicate.iterator();
//			
//			while(itr.hasNext())
//			{
//				li.remove(itr.next());
//			}
//			
		for(int i =0;i<l2.size();i++)
		{
			li.remove(l2.get(i));
		}
		
		
		System.out.println(li.size());
		
	}

}
