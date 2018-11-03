package homework5;

public class Work03 {
	
	//找出int[][]陣列中最大的值
	public int maxElement(int[][] x) {
		int maxElement = 0;
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
				if( x[i][j] > maxElement) {
					maxElement = x[i][j];
				}
			}
		}
		
		return maxElement;
	}
	
	//找出double[][]陣列中最大的值
	public double maxElement(double[][] x) {
		double maxElement = 0;
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
				if( x[i][j] > maxElement) {
					maxElement = x[i][j];
				}
			}
		}
		
		return maxElement;
	}
}
