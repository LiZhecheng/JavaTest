package exercise.object;

public class PolyAnimal  {
	public static void main(String[] args) {
		Animal[] b = {
				new Animal( 3, 8.0f), new Elephant(8, 1200.0f, "大象")
		};
		
		for(int i = 0; i < b.length;i++) {
			b[i].speak();
		}
		
	}
}
