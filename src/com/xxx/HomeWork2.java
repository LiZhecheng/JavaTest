package com.xxx;

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("計算1~1000的偶數和");
		evenSum(1000);
		System.out.println();
		
		System.out.println("用for迴圈做1~10的連乘積");
		factorial(10);
		System.out.println();
		
		System.out.println("用while迴圈做1~10的連乘積");
		factorialW(10);
		System.out.println();
		
		System.out.println("輸出1~10的平方");
		square(10);
		System.out.println();
		
		System.out.println("1~49, 沒有4的數字, 並計算有幾個");
		notOutFour(49);
		System.out.println();
		
		System.out.println("用1~10顯示倒直角三角形");
		intInvertTriangle(10);
		System.out.println();
		
		System.out.println("用A~F顯示直角三角形");
		outputCharTriangle('A');
		// System.out.printf("%c", a);

	}

	public static void evenSum(int number) {
		int sum = 0;
		for (int i = 2; i <= number; i += 2) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

	// 階乘
	public static void factorial(int number) {
		int factorialN = 1;
		for (int i = 2; i <= number; i++) {
			factorialN *= i;
		}
		System.out.println(factorialN);
	}

	public static void factorialW(int number) {
		int factorialWN = 1;
		int count = 2;
		while (count <= number) {
			factorialWN *= count;
			count++;
		}
		System.out.println(factorialWN);
	}

	// 用加法來做出每個數的平方, (i-1)的平方+2i+1=下一個數的平方
	public static void square(int number) {
		int squareN = 0;
		int end = number * 2;
		int count = 1;
		do {
			squareN += count;
			count += 2;
			System.out.print(squareN + " ");
		} while (count <= end);

		System.out.println();
	}

	// 當數字%10的值是4時, 代表其個位數有4
	// 當數字/10的值是4時(如果超過100還要再取餘數), 代表其十位數有4
	public static void notOutFour(int Number) {
		int countExcludeFour = 0;
		for (int i = 1; i <= Number; i++) {
			if (i % 10 == 4 || i / 10 == 4) {

			} else {
				countExcludeFour++;
				System.out.print(i + "\t");
			}
			if (i % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println("總共有" + countExcludeFour + "個");
	}

	//
	public static void intInvertTriangle(int maxInt) {
		for (int i = 1; i <= maxInt; i++) {
			for (int j = 1; j <= maxInt - i + 1; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void outputCharTriangle(int charT) {
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.printf("%c", charT + i);
			}
			System.out.println();
		}
	}
}
