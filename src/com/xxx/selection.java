package com.xxx;

import java.util.Scanner;

public class selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, n ;
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入數字");
		n = input.nextInt();
		
		switch(n) {
			case 1:
				i++;
				System.out.println(i);
			case 2:
				i++;
				System.out.println(i);
				break;
			default:
				i = 9;
				break;
			case 5:
				i = 5;
				break;
			
		}
		System.out.println(i);
	}		


}
