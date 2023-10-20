package operator;

public class B_assignment {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		a = b; // a라는 메모리에 b의 값을 저장
		
		System.out.println(a);
		System.out.println();
		
		a = 10;
		b = 20;
		
		System.out.println(a + b);
		System.out.println("a + b 했을 때의 a : "  + a);
		System.out.println(a += b);
		System.out.println("a += b 했을 때의 a : "  + a);
	}

}
