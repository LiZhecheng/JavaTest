package com.xxx;

public class WhileVsDowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 100;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
//		條件判斷為false不進入迴圈
		i = 101;
		do {
			System.out.println(i);
			i++;
		} while (i <= 10);
//		先做一次顯示101並i+1變成102
//		條件判斷為false跳出迴圈

	}

}
