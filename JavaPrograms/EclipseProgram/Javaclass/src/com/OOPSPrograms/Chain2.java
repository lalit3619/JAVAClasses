package com.OOPSPrograms;

public class Chain2 extends Chain1 {
	Chain2 (int a){
		super(a);
		System.out.println("Superchain2 Constructor a="+a);
	}
	public static void main(String[] args) {
		System.out.println("MAin Starts");
		Chain2 c=new Chain2(34);
		System.out.println("Main ends");

	}

}
