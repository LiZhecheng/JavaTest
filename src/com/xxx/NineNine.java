package com.xxx;

public class NineNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("一:用for+while迴圈產生九九乘法表");
		nineNineFW();
		System.out.println("二:用for+do while迴圈產生九九乘法表");
		nineNineFDW();
		System.out.println("三:用while+do while迴圈產生九九乘法表");
		nineNineWDW();
	}

	public static void nineNineFW() {
		for (int i = 1; i <= 9; i++) {
			int count = 1;
			while (count <= 9) {
				System.out.print(i + "*" + count + "=" + i * count + "\t");
				count++;
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void nineNineFDW() {
		for (int i = 1; i <= 9; i++) {
			int count = 1;
			do {
				System.out.print(i + "*" + count + "=" + i * count + "\t");
				count++;
			} while (count <= 9);
			System.out.println();
		}
		System.out.println();
	}

	public static void nineNineWDW() {
		int wCount = 1;
		while (wCount <= 9) {
			int count = 1;
			do {
				System.out.print(wCount + "*" + count + "=" + wCount * count + "\t");
				count++;
			} while (count <= 9);
			System.out.println();
			wCount++;
		}
		System.out.println();
	}
}
