package com.xxx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	費氏數列  0 1 1 2 3 5 8 13 21 34 55
		  0 1 2 3 4 5 6 7  8  9  10
*/
public class FibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("請輸入資料");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		try {
			int data = br.read();		//這是讀char會是ASCII值
			System.out.println(data);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		int f = 10; //
		int number = 0;
		number = fibonacciNumber(f);
		fibonacciWhile(f); 
		//System.out.println(number);
	}
	//遞迴版本的費氏數列
	public static int fibonacciNumber(int f ) {
		
		if(f == 0) {
			return 0;
		}
		if (f == 1) {
			return 1;
		}
		
		return fibonacciNumber(f - 1)+fibonacciNumber(f - 2);
	}
	//迴圈
	public static void fibonacciWhile(int f) {
		
		int f0 = 0;
		int f1 = 1;
		int count = 2;
		int sum = 0;
		System.out.println(f0+"\n"+f1);
		while(count <= f) {
			
			sum = f0 + f1;	
			f0 = f1;
			f1 = sum;
			System.out.println(sum);
			count++;
		}
		
	}
}
