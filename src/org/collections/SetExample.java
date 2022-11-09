/**
 * 
 */
package org.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * @author s.m.govindarajan
 * 
 * Create a set 10 details of employee
 * with employee details 
 * 
 * Employee name
 * Employee Id
 * employee phone
 * employee address
 * DOB
 * DOJ
 * email
 * gender
 * Salary
 * 
 *
 */


class Employee
{
	String emp_name;
	String emp_Id;
	String emp_phone;
	String emp_address;
	String DOB;
	String DOJ;
	String email;
	String gender;
	String Salary;


	public Employee(String emp_namep,String emp_idp, String emp_phonep, String emp_addressp, String DOBp, String DOJp, String emailp, String genderp, String Salaryp)
	{
		this.emp_name = emp_namep;
		this.emp_Id = emp_idp;
		this.emp_phone = emp_phonep;
		this.emp_address = emp_addressp;
		this.DOB = DOBp;
		this.DOJ = DOJp;
		this.email = emailp;
		this.gender = genderp;
		this.Salary = Salaryp;
	}
	
	@Override
	public String toString()
	{
		
		return "Employee name:"+this.emp_name+"\n"+"Employee ID:"+this.emp_Id+"\n"+"Employee_phone:"+this.emp_phone
				+"Employee_address:"+this.emp_address+"\n"+"DOB:"+this.DOB+"\n"+"DOJ:"+this.DOJ+"email:"+this.email+"\n"
				+"gender:"+this.gender+"\n"+"Salary:"+this.Salary+"\n";
		
	}
	
}



public class SetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Employee e;
		
		Set<Employee> se = new HashSet<Employee>();
		
		for(int i =0;i<2;i++)
		{
			System.out.println("Enter the employee name");
			String name = sc.nextLine();
			System.out.println("Enter the employee Id");
			String Id = sc.nextLine();
			System.out.println("Enter the employee phone");
			String phone = sc.nextLine();
			System.out.println("Enter the employee address");
			String address = sc.nextLine();
			System.out.println("Enter the employee DOB");
			String dob = sc.nextLine();
			System.out.println("Enter the employee DOJ");
			String doj = sc.nextLine();
			System.out.println("Enter the employee email");
			String email = sc.nextLine();
			System.out.println("Enter the employee gender");
			String gender = sc.nextLine();
			System.out.println("Enter the employee Salary");
			String Salary = sc.nextLine();
			
			
			 e= new Employee(name,Id,phone,address,dob,doj,email,gender,Salary);
			
			se.add(e);
			
			e = null;
					
			
		}
		Iterator<Employee> ie=se.iterator();
		
		while(ie.hasNext())
		{
			Employee e1 = ie.next();
			System.out.println(e1.toString());
			
		}
		
	}

}
