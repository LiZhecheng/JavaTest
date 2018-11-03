package homework5;

public class RandomNumber {
	
	//取的亂數會重複
	//times 要幾個亂數, begin 和 excludeEnd 亂數的範圍 
	//ex : 要2~30的亂數(頭尾都包含)4個, 就用 repeatRandomNumber(4, 2, 31)
	public int[] repeatRandomNumber(int times, int begin, int excludeEnd) {
		
		int[] randomNumber = new int[times];
		int range = excludeEnd - begin;		//不包含尾端就不+1了
		for( int i = 0; i < times; i++) {
			randomNumber[i] = (int)(begin + Math.random()*range );
		}
		
		return randomNumber;
	}
	
	//取0~100(頭尾包含)中10個亂數, 並計算這10個亂數的平均值
	public void randAvg() {
		
		int[] randomNumber = new int[10];
		randomNumber = repeatRandomNumber(10, 0, 101);
		int sum = 0;
		System.out.println("本次亂數結果 :");
		for(int i = 0; i < randomNumber.length; i++) {
			System.out.print(randomNumber[i] + " ");
			sum += randomNumber[i];
		}
		System.out.println();
		System.out.println("本次亂數平均值為 :" + sum / randomNumber.length);
		
	}

}
