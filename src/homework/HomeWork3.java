package homework;

import java.util.Scanner;

public class HomeWork3 {
 //Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] side = new int[3];
		int dontLike;
		Scanner input = new Scanner(System.in);
		HomeWork3 hw = new HomeWork3();

		System.out.println("請輸入三個整數, 判斷是否為三角形");
		side[0] = input.nextInt();
		side[1] = input.nextInt();
		side[2] = input.nextInt();

		hw.judgeTriangle(side);
		hw.guessRandomNumber(input, 101);
		System.out.println("請輸入一個不想要的數字(1 ~ 49)");
		dontLike = input.nextInt();
		hw.dnotLikeNumber(dontLike, 49);
	}

	//利用三角形公式a+b>c判斷輸入的數字是否為三角形的邊長
	//如果a平方+b平方 = c平方就是直角三角形
	public void judgeTriangle(int[] side) {
		int temp;
		//將輸入的數字排序, 最長邊放在side[0]
		if (side[0] < side[1]) {
			temp = side[0];
			side[0] = side[1];
			side[1] = temp;
		}

		if (side[1] < side[2]) {
			temp = side[1];
			side[1] = side[2];
			side[2] = temp;

			if (side[0] < side[1]) {
				temp = side[0];
				side[0] = side[1];
				side[1] = temp;
			}
		}

		if (side[1] + side[2] <= side[0]) {
			System.out.println("不是三角形");
			return;
		}

		if (side[1] * side[1] + side[2] * side[2] == side[0] * side[0]) {
			System.out.println("這是直角三角形");
			return;
		}

		if (side[1] == side[2]) {

			if (side[1] == side[0]) {
				System.out.println("這是正三角形");
				return;
			}

			System.out.println("這是等腰三角形");
			return;
		}

		System.out.println("其他三角形");

	}
	
	//產生一個0 ~ 100的亂數, 並讓使用者猜產生的亂數是多少
	public void guessRandomNumber(Scanner input, int range) {
		int randomNumber = (int) (Math.random() * range);
		int userGuessNumber;
		System.out.println("輸入一個數, 猜猜看亂數(0~" + (range - 1) + ")是多少");

		while (true) {
			userGuessNumber = input.nextInt();
			if (randomNumber == userGuessNumber) {
				System.out.println("亂數是 : " + randomNumber + " ,猜對了");
				return;
			}

			if (randomNumber > userGuessNumber) {
				System.out.println("亂數大於你猜的數字, 請重新輸入");
			} else {
				System.out.println("亂數小於你猜的數字, 請重新輸入");
			}
		}
	}
	
	//使用者輸入不喜歡的數, 如果是4就不是只要有4就不出現
	//如果是兩位數以上, 如14就是14這個號碼不出現
	//zeroCanChoice[i]的值為-1代表是不要的數
	//						0代表是可選的數
	//						1代表是已選過的數
	public void dnotLikeNumber(int dontLike, int number) {
		int countCanChoice = number;
		int controlWhile = 0;
		byte[] zeroCanChoice = new byte[number];	
		int[] randomNumber = new int[6];

		if (dontLike >= 10) {
			zeroCanChoice[dontLike - 1] = -1;
			countCanChoice--;
			controlWhile = number;
		}

		while (controlWhile < number) {
			if ((controlWhile + 1) % 10 == dontLike || (controlWhile + 1) / 10 == dontLike) {
				zeroCanChoice[controlWhile] = -1;
				countCanChoice--;
			}
			controlWhile++;
		}

		for (int i = 0; i < number; i++) {
			if (zeroCanChoice[i] == 0) {
				System.out.print(i + 1 + "\t");
			}

			if ((i + 1) % 10 == 0) {

				System.out.println();
			}
		}
		System.out.println();
		System.out.println("總共有" + countCanChoice + "個");
		
		controlWhile = 0;
		System.out.print("這是系統為您挑選的號碼 : ");
		while (controlWhile < 6) {
			randomNumber[controlWhile] = (int) (Math.random() * number) + 1;
			if (zeroCanChoice[randomNumber[controlWhile] - 1] == 0) {
				zeroCanChoice[randomNumber[controlWhile] - 1] = 1;
				System.out.print(randomNumber[controlWhile] + "\t");
				controlWhile++;
			}
		}
	}
}
