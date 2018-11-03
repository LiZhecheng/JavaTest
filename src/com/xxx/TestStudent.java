package com.xxx;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student david = new Student();
		Student mary = new Student();
		
		david.play(2);
		david.study(5);
		
		mary.play(4);
		mary.study(6);
		
		System.out.println(david.score);
		System.out.println(mary.score);
	}

}
