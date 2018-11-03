package com.xxx;

public class VariableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1 = 1;
		int i2 = 2;
		int i3 = 3;
		
//		int i1,i2,i3;	//上面因為資料型態相同可以改成這樣
		
		int i4,i5,i6 = 6; //只有i6有值
		
		i4 = 5;
		i4 = 6;			//i4的值會被改成6
		
		int i7 = 7,i8 = 8; //也可以這樣宣告
		
		final int i9 = 5;
//		i9 = 6;			//final不可在改其值
	}

}
