/**
 * 
 */
package org.strings;

/**
 * @author s.m.govindarajan
 *
 */
public class VarargsImplementation {

	/**
	 * @param args
	 */
	
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public void add(int[] a)
	{
		int sum = 0;
		for(int i =0;i<a.length;i++)
		{	
			sum+=a[i];
		}
		System.out.println(sum);
	}
	public void add_varargs(int ...a)
	{
		for(int value:a)
		{
			System.out.println(value);
		}
		
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VarargsImplementation v=new VarargsImplementation();
		v.add(2,3);
		v.add(new int[]{10,20,30,40,50});
		
		v.add_varargs(4);
		v.add_varargs(5,9,12);
		
		v.add_varargs(5,9,12,112,343,3234,12131);
		v.add_varargs();
		
	}

}
