package com.xxx;
import static java.lang.System.out;

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		out.println("Main thread 開始...");
		Thread threadB = new Thread(() -> {
			out.println("Thread B 開始");
			for ( int i = 0; i < 5; i++) {
				out.println("Thread B 執行");
			}
			out.println("Thread B 將結束");
		});
		
		threadB.start();
		threadB.join(); //Thread B 加入 Main Thread流程
		out.println("Main thread 將結束");
		
	}

}
