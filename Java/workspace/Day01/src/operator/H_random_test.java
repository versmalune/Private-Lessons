package operator;

public class H_random_test {
	
	public static void main(String[] args) {
		
		/*실습 : 2~9단 구구단을 랜덤하게 출력*/
		int a, b;
		a = (int)(Math.random()*8) + 2; // 2 ~ 9 중 랜덤 
		b = (int)(Math.random()*8) + 2; // 2 ~ 9 중 랜덤 
		System.out.println( a + " x " + b + " = " + a * b);
		
	}

}