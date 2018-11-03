package exercise.array;

public class TestRandomArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] x = new int[3][3];
		int[][] y = new int[3][3];
		int[][] z = new int[3][3];
		//因為x,y,z存的是陣列位址
		//
		randNumberArray(x);
		randNumberArray(y);
		
		addTwoArray(x, y, z);
		displayArray(x, y, z);

	}

	public static void randNumberArray(int[][] temp) {

		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[i].length; j++) {
				temp[i][j] = (int) (Math.random() * 31);
			}
		}

	}

	public static void addTwoArray(int[][] array1, int[][] array2, int[][] sumArray) {
		for (int i = 0; i < sumArray.length; i++) {
			for (int j = 0; j < sumArray[i].length; j++) {
				sumArray[i][j] = array1[i][j] + array2[i][j];
			}
		}
	}

	public static void displayArray(int[][] array1, int[][] array2, int[][] sumArray) {
		for (int i = 0; i < sumArray.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				System.out.print(array1[i][j] + "\t");
			}
			System.out.print(" ");
			for (int j = 0; j < array2[i].length; j++) {
				System.out.print(array2[i][j] + "\t");
			}
			System.out.print(" ");
			for (int j = 0; j < sumArray[i].length; j++) {
				System.out.print(sumArray[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
