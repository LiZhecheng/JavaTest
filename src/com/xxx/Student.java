package com.xxx;

public class Student {
	int score = 90;
	
	public void play(int hours) {
		score -= hours;
	}
	
	public void study(int hours) {
		score += hours;
	}
}
