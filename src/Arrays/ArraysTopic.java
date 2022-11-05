/**
 * 
 */
package Arrays;

import java.util.Scanner;

/**
 * @author s.m.govindarajan
 *
 */
public class ArraysTopic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
	
		int[] a = new int[5];
		int[] b = {1,3,5,10};
		int c[] = new int[7];
		
		*/
		
		int[] a = {1,3,5,7};
		
		for(int i =0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("============");
		System.out.println(a[2]);
		
		float[] c = {1.2f, 3.4f,6.8f};
		
		System.out.println("=========");
		
		for(int i =0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	
		int[] d = new int[4];
		
		Scanner sc = new Scanner(System.in);

		for(int i =0;i<d.length;i++)
		{
			System.out.println("Enter the "+i+" value");
			d[i]=sc.nextInt();
		}
		
		for(int i=0;i<d.length;i++)
		{
			System.out.println(d[i]);
		}
		
		
	}

}
