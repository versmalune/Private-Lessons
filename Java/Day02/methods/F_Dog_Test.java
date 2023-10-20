package methods;

public class F_Dog_Test {

	public static void main(String[] args) {
		
		E_Dog firstDog = new E_Dog();
		
		firstDog.name = "choco";
		firstDog.age = 3;
		firstDog.size = 1;
		
		firstDog.bark(2);
		firstDog.eat("간식", 3);
		
	}
}