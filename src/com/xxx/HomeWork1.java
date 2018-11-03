package com.xxx;

public class HomeWork1 {
	private static final double PI = 3.1415;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("第一題");
		System.out.println("12+6=" + add(12, 6));
		System.out.println("12*6=" + product(12, 6));

		System.out.println("第二題");
		egg(200);
		System.out.println("第三題");
		secToDayHMS(256559);

		System.out.println("第四題");
		System.out.println("半徑5的圓面積為 : " + circleArea(5));
		System.out.println("半徑5的圓周長為 : " + circlef(5));

		System.out.println("第五題");
		System.out.println("150萬, 年利率2%, 10年後" + bank(1_500_000, 10));

		System.out.println("第六題");
		
		//整數相加, 所以5+5=10
		System.out.println(5 + 5);

		/*
		 * char實際是數值拿去對編碼表, 然後產生對應的符號 char和int相加視為算術運算, 會取char的數值來和int相加 '5'的數值是53
		 * 5+53=58
		 */
		System.out.println(5 + '5');

		// int+字串會是做字的串接, 整數5被接在字串5之前, 所以是55
		System.out.println(5 + "5");//

	}

	// 第一題
	// 整數和
	public static int add(int a, int b) {
		return a + b;
	}

	// 第一題
	// 整數相乘
	public static int product(int a, int b) {
		return a * b;
	}

	// 第二題
	// 計算有幾打幾顆
	// 利用整數除法取得有幾打, 再利用取餘數算出分玩打之後還餘下幾顆
	public static void egg(int a) {

		System.out.println("200顆蛋有" + a / 12 + "打,有" + a % 12 + "顆");
	}

	// 第三題
	// 將秒數轉成日時分秒
	// time[3]存放秒轉換為分鐘後剩下的秒數
	// time[2]存分轉換為小時後剩下的分
	// time[1]存小時轉換為天後剩下的小時
	// time[0]存天
	public static void secToDayHMS(int sec) {
		int time[] = new int[4];

		time[2] = sec / 60;
		time[3] = sec % 60;
		time[1] = time[2] / 60;
		time[2] = time[2] % 60;
		time[0] = time[1] / 24;
		time[1] = time[1] % 24;

		System.out.println(time[0] + "天" + time[1] + "時" + time[2] + "分" + time[3] + "秒");
	}

	// 第四題
	// 算圓面積
	public static double circleArea(int radius) {
		double area = radius * radius * PI;
		return area;
	}

	// 第四題
	// 算圓周長
	public static double circlef(int radius) {
		double f = 2 * radius * PI;
		return f;
	}

	// 第五題
	// 複利做10次, double的精準度會造成誤差
	public static double bank(double money, int year) {
		double sum = money * Math.pow(1.02, year);
//		double sum = money;
//		for (int i = year; i > 0; i--) {
//			sum = sum * 1.02;
//		}

		return sum;
	}
}
