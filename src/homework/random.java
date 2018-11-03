package homework;

public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] random = new int[6];
		int count = 0;
		
		//邏輯錯誤, 無窮迴圈
		//第一次亂數完, 到for迴圈判定,但是count為0, i為0進不了for迴圈
		//count沒有變化
		//到下一次for迴圈還是進不了
		//進不了for迴圈count不會變化, 就是無窮迴圈
		while (count < 6) {
			random[count] = (int) (Math.random() * 49 + 1);
			for (int i = 0; i < count; i++) {
				if( random[count] != random[i]) {
					count++;
				}
			}
		}
	}

}
