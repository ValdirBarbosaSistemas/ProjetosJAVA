package classe;

public class AreaCircFinal {
	public static void main(String[] args) {
		AreaCirc a1 = new AreaCirc(10);
		//a1.pi = 10;
		System.out.println(a1.area());
		
		AreaCirc a2 = new AreaCirc(5);
		//a2.pi = 5;
		
		AreaCirc.pi = 3.1415;
		System.out.println(a2.area());
	}
}
