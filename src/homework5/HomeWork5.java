package homework5;

import java.util.Scanner;

public class HomeWork5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width;
		int height;
		int[][] intArray = {
				{1, 6, 3},
				{9, 5, 2}
			};
		double[][] doubleArray = {
				{1.2, 3.5, 2.2},
				{7.4, 2.1, 8.2}
			};
		Scanner input = new Scanner(System.in);
		CmdPrintShape cmdPrintShape = new CmdPrintShape();
		RandomNumber randomNumber = new RandomNumber();
		Work03 w = new Work03();
		AuthCode produceAuthCode = new AuthCode();
		
		System.out.println("請輸入寬與高");
		width = input.nextInt();
		height = input.nextInt();
		cmdPrintShape.starSquare( width, height);
		System.out.println("==========================");
		randomNumber.randAvg();
		System.out.println("==========================");
		System.out.println(w.maxElement(intArray));
		System.out.println(w.maxElement(doubleArray));
		System.out.println("==========================");
		produceAuthCode.genAuthCode();

		
	}
	

}
