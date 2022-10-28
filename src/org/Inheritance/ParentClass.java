package org.Inheritance;

public class ParentClass {

	//private, public, protected
	
	int a =20;
	private int b = 30;
	public int c=40;
	protected int d= 50;
	
	
	
	
}


class SubClass extends ParentClass
{
	void method1() {

	System.out.println(a);
	//System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	}	
}


class SubClass2
{
	void method2()
	{
		ParentClass p = new ParentClass();
		System.out.println(p.a);
		System.out.println(p.c);
		System.out.println(p.d);
	}
}

