package com.xxx;

public class indecreaseOperatorFWD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;
		while (count++ < 5) {
			System.out.println("count = " + count);
		}
		// 2,3,4,5
		count = 1;
		while (5 > count++) {
			System.out.println(count);
		}
		//這兩個都是先取值做比較然後遞增count
		//再進入迴圈內的敘述做事
		//
	}

}
