package com.pro1;

public class Nonstaticvar {
	//Non Static Variable
	int a;
	String s;

	public static void main(String[] args) {
		System.out.println("Main Starts");
		
		
		Nonstaticvar n1=new Nonstaticvar();
		n1.a=007;
		n1.s="James bond";
		System.out.println("a="+n1.a);
		System.out.println("s="+n1.s);
		System.out.println("Main ends");

	}

}
