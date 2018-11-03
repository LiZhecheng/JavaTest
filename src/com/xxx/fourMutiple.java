package com.xxx;

public class fourMutiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//用取餘數來判斷100個數字中4的倍數是多少
		//四的倍數一定會被四整除, 也就是餘數為0
		for(int i = 0; i <= 100; i++) {
			if( i%4 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		//每次迴圈都加四, 並且是從0(4的倍數)開始
		//所以每次迴圈都會是四的倍數
		for(int i = 0; i <= 100; i+=4) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		//100/4=25代表100裡面四的倍數有25個包含零的話26個
		//所以把0~25去乘四就可以得到0~100中四的倍數		
		for(int i = 0; i <= ( 100/4); i++) {
			System.out.print(i*4 + " ");
		}
	}

}
