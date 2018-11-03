package com.xxx;

public class TestOperatorAssocia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 6;
		int i =0;
		i=( b++ > 8 && a++ > 7 )?220:a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(i);
	}
	

}
