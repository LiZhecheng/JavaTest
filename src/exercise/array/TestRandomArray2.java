package exercise.array;

public class TestRandomArray2 {
	
	//利用getRandomArray產生兩個亂數陣列
	//將兩陣列的同索引位置的數相加放到z陣列同索引的位置
	//透過printRandomArray將陣列的值印出
	public static void main(String[] args) {
		TestRandomArray2 tra = new TestRandomArray2();
		int[][] x = tra.getRandomArray();
		int[][] y = tra.getRandomArray();
		int[][] z = new int[3][3];

		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
			}
		}

		tra.printRandomArray(x);
		tra.printRandomArray(y);
		tra.printRandomArray(z);

	}

	// 產生一個二維陣列, 裡面元素為0~30的隨機數
	// 最後將這個陣列的位址回傳
	// data.length列數,也就是有多少個一維陣列
	// data[i].length這個一維陣列有多少個元素
	public int[][] getRandomArray() {
		int[][] data = new int[3][3];
		for (int i = 0; i < data.length; i++) {
			
			for (int j = 0; j < data[i].length; j++) {
				
				int random = (int) (Math.random() * 31);
				data[i][j] = random;
				
			}
		}
		return data;
	}
	
	//將陣列元素都跑過一遍, 印出
	//利用data.length取得有多少個一維陣列
	//利用data[i].length取得每個一維陣列的長度
	public void printRandomArray(int[][] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("=======================");
	}

}
