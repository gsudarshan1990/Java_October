/**
 * 
 */
package Arrays;

/**
 * @author s.m.govindarajan
 *
 *
 *  Input  a[]= {10,10,20,50,60,80,60,50}
 */
public class RemoveDuplicatesArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {10,10,20,50,60,80,60,50};
		
		int size = a.length;
		
		int count, index=0;
		
		int anti_duplicatearray[]= new int[size];
		
		for(int i =0;i<size;i++)
		{
			count=0;
			
			for(int j=i+1;j<size;j++)
			{
				if(a[i] == a[j])
				{
					count =1;
					break;
				}
			}
			
			if(count == 0)
			{
				anti_duplicatearray[index]=a[i];
				index++;
			}
		}
	
		System.out.println("Array after the duplicate removal");
		
		for(int k =0;k<index;k++)
		{
				System.out.println(anti_duplicatearray[k]);
		}
		

	}

}
