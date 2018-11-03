package exercise.object;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animalTest = new Animal( 2, 5.0f);
		animalTest.speak();
		
		animalTest.setAge(5);
		animalTest.setWeight(50.0f);
		animalTest.speak();
	}

}
