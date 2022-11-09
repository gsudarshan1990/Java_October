/**
 * 
 */
package org.collections;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


/**
 * @author s.m.govindarajan
 * 
 * Description: Create a userdefine Set and insert the 10 Student details
             Key    :  stdId,stdName,stdPhone,address,dOB,eMail,gender
             Give the related values for key for each Student
 *
 */

class Student
{
	String StudentName;
	String StudentID;
	String StudentPhone;
	String Address;
	String DOB;
	String email;
	String gender;
	
	
	public Student(String student_namep, String studendID_p, String student_phonep,String student_addressp,String studentdob, String emailp, String gender)
	{
		this.StudentName = student_namep;
		this.StudentID = studendID_p;
		this.StudentPhone = student_phonep;
		this.Address = student_addressp;
		this.DOB = studentdob;
		this.email = emailp;
		this.gender = gender;
		
	}

	@Override
	public String toString()
	{
		
		return "Student name:"+this.StudentName+"\n"+"Student ID:"+this.StudentID+"\n"+"Student_phone:"+this.StudentPhone
				+"Student_address:"+this.Address+"\n"+"DOB:"+this.DOB+"\n"+"email:"+this.email+"\n"
				+"gender:"+this.gender+"\n";
		
	}
	
}

public class MapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Map<String,Student> hm = new HashMap<String,Student>();
		
		for(int i =0;i<10;i++)
		{
			
			System.out.println("Enter the Student name with more than 5 letters");
			String name = sc.nextLine();
			System.out.println("Enter the Student Id");
			String Id = sc.nextLine();
			System.out.println("Enter the Student phone");
			String phone = sc.nextLine();
			System.out.println("Enter the Student address");
			String address = sc.nextLine();
			System.out.println("Enter the Student DOB");
			String dob = sc.nextLine();
			System.out.println("Enter the Student email");
			String email = sc.nextLine();
			System.out.println("Enter the Student gender");
			String gender = sc.nextLine();
			
			Student s = new Student(name,Id,phone,address,dob,email,gender);
			
			String key = name.substring(0,3);
			
			hm.put(key, s);
			
			s = null;
			key = null;
			
		}
		
		Set<HashMap.Entry<String, Student>> entryset = hm.entrySet();
		
		Iterator itr = entryset.iterator();
		
		while(itr.hasNext())
		{
			HashMap.Entry<String,Student> entry = (HashMap.Entry<String, Student>) itr.next();
			System.out.println("Key:"+entry.getKey());
			System.out.println("Student Details"+entry.getValue().toString());
		
		}
		
	}

}
