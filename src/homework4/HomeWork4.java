package homework4;

import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int[][] employeeIdMoney = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };
		int money = 0;

		int[][] classScores = { { 10, 35, 40, 100, 90, 85, 75, 70 }, 
								{ 37, 75, 77, 89, 64, 75, 70, 95 },
								{ 100, 70, 79, 90, 75, 70, 79, 90 }, 
								{ 77, 95, 70, 89, 60, 75, 85, 89 },
								{ 98, 70, 89, 90, 75, 90, 89, 90 }, 
								{ 90, 80, 100, 75, 50, 20, 99, 75 } };
		Scanner input = new Scanner(System.in);
		String userInput;
		String[] planet = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		CalculateScore calculateScore = new CalculateScore();
		DealString dealString = new DealString();
		DealDate dealDate = new DealDate();

		calculateScore.printUpAverage(scores);
		System.out.println("========================");
		System.out.println("Please input any string to reverse");
		userInput = input.nextLine();
		System.out.println(dealString.reverseString(userInput));
		System.out.println("========================");
		dealString.countStringVowel(planet);
		System.out.println("========================");
		System.out.println("請輸入要借的金額");
		money = input.nextInt();
		input.nextLine();
		borrowMoney(money, employeeIdMoney);
		System.out.println("========================");
		System.out.println("Please enter a Date like:AD 1984 9 8 or BC 1 2 3");
		userInput = input.nextLine();
		dealDate.stringToYearMonthDay(userInput);
		calculateScore.timesOfClassmatesHighest(classScores);

	}
	
	//借錢用的, 可以幫忙找有誰的存款夠
	public static void borrowMoney(int money, int[][] employeeIdMoney) {
		int countCanBorrow = 0;
		System.out.print("有錢可借的員工編號 : ");
		for (int i = 0; i < employeeIdMoney[0].length; i++) {
			if (employeeIdMoney[1][i] >= money) {
				System.out.print(employeeIdMoney[0][i] + " ");
				countCanBorrow++;
			}
		}

		System.out.println("共" + countCanBorrow + "人");
	}

}
