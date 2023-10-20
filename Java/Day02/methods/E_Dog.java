package methods;

public class E_Dog {

	String name;
	int age;
	int size;
	
	void bark(int numOfBarks) {
		while (numOfBarks > 0) {
			System.out.print("멍멍!");
			numOfBarks--;
		}
		System.out.println();
	}
	
	void eat(String food, int numOfFood) {
		for(int i = 1; i <= numOfFood; i++) {
			System.out.println(i + "번째 " + food + " 먹는 중...");
		}
		System.out.println("냠냠 끝");
	}

}