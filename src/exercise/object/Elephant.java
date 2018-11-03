package exercise.object;

public class Elephant extends Animal {
	private String name;
	
	public Elephant(int age, float weight, String name) {
		super(age, weight);
		this.name = name;
	}
	
	
	public void speak(int a) {
		super.speak();
		System.out.println("種類是 : " + name);
	}
	
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		super.speak();
		System.out.println("種類為:" + name);
	}
}
