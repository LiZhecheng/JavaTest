package homework4;

public class CalculateScore {

	// 計算陣列的平均值
	public int calculateAverage(int[] scores) {

		int sum = 0;
		int average;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		average = sum / scores.length;
		return average;
	}

	// 印出平均值和高於平均值的元素
	public void printUpAverage(int[] scores) {
		int average = calculateAverage(scores);

		System.out.println("Averag Value : " + average);
		System.out.print("Above average elements : ");
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > average) {
				System.out.print(scores[i] + "\t");
			}
		}
		System.out.println();
	}
	
	//計算每位同學考最高分的次數, 並印出
	public void timesOfClassmatesHighest(int[][] classScores) {
		int[] classmates = new int[classScores[0].length];

		for (int i = 0; i < classScores.length; i++) {
			classmates[highest(classScores[i])]++;
		}

		for (int i = 0; i < classmates.length; i++) {
			System.out.println(i + 1 + "號同學最高分次數 : " + classmates[i]);
		}
	}
	
	//計算這次小考誰是最高分並回傳其索引
	public int highest(int[] scores) {
		int highestIndex = 0;
		int score = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > score) {
				score = scores[i];
				highestIndex = i;
			}
		}
		return highestIndex;
	}
}
