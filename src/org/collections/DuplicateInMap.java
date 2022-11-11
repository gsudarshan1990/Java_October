/**
 * 
 */
package org.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @author s.m.govindarajan
 *
 *Duplicate from ["Google","TCS", "Apple", "Google","Apple","Microsoft"]
 */
public class DuplicateInMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 	HashMap<Integer, String> hashMap=new HashMap<>();
	        hashMap.put(01,"Google");
	        hashMap.put(02,"TCS");
	        hashMap.put(03,"Apple");
	        hashMap.put(04,"Google");
	        hashMap.put(05,"Apple");
	        hashMap.put(06,"Microsoft");	
	        
	        System.out.println(hashMap.values());
	        Set<String> non_duplicate = new HashSet<>(hashMap.values());
	        System.out.println(non_duplicate);
	        
	        List<String> l2 = new LinkedList<>(hashMap.values());
	        List<String> l3 = new LinkedList<>(non_duplicate);
	        
	       
	        for(int i=0;i<l3.size();i++)
	        {
	        	l2.remove(l3.get(i));
	        }
	       
	       System.out.println(l2.size()); 
	        
	        

	}

}
