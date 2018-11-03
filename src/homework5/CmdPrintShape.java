package homework5;

public class CmdPrintShape {
	
	public void starSquare(int width, int height) {
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				System.out.print('*');
			}
			System.out.println("");
		}
	}
}
