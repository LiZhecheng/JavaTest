package exercise.array;

import java.util.Scanner;

public class students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] students = new int[5][];
		
		students[0] = new int[8];
		Scanner input = new Scanner(System.in);
		
		students[1] = new int[input.nextInt()];
		
		
		for(int i = 0; i<students.length;i++) {
			System.out.println(students[0][i]);
		}
		
		System.out.print(students[1][1]);
	}

}
