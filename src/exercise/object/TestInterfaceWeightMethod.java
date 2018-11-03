package exercise.object;

public class TestInterfaceWeightMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeightMethod[] wm = new WeightMethod[3];
		wm[0] = new Plane();
		wm[1] = new Dog();
		wm[2] = new Powder();
		
		for(int i = 0; i < wm.length;i++) {
			wm[i].getWeightMethod();
		}
	}

}
