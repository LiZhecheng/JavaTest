package com.xxx;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double weight = 60;
		double height = 1.60;
		double BMI = weight / (height*height); 
		System.out.printf("BMI(format = %.2f)\n", BMI);
		
		if(BMI < 18.5) {
			System.out.println("過瘦");
		}
		else {
			if (18.5<=BMI && BMI < 24) {
				System.out.println("正常");
			}
			else {
				System.out.println("過胖");
			}
		}
	}

}
