package operator;

public class D_relational {
	
	public static void main(String[] args) {
		
		/*관계 연산자 : < , <= , > , >= , == , !=
		결과는 boolean type (true / false)*/
		
		boolean a;
		a = (10==20);
		System.out.println(a);
		System.out.println();
		
		int b = 10;
		a = (10 == b++); //먼저 관계 비교 후, b +1 시킴
		System.out.println(a); //따라서 a = true
		System.out.println(b);
	}

}
