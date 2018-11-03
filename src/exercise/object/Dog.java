package exercise.object;

public class Dog implements WeightMethod {
	private String name;
	private double weight;
	
	public Dog() {
		super();
	}

	public Dog(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void getWeightMethod() {
		System.out.println("使用體重計");
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	
	
}