package com.OOPSPrograms;

public class Super2 extends Super1 {
public void Test2()
{
	int i=78945645;
	System.out.println(i);
	System.out.println(super.i);
	super.Test1();
}
	public static void main(String[] args) {
		Super2 s=new Super2();
		s.Test2();
	}
}
 