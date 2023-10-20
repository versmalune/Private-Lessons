package operator;

public class F_ternary {
	
	public static void main(String[] args) {
		
		/*조건연산자 : 조건식 ? 참일 경우 선택 값 : 거짓일 경우 선택 값 ;*/
		
		int a = 10;
		int b = 20;
		
		int max;
		
		max = a > b ? a : b ; 	//a가 b보다 크다가 참이라면 a가 max값, 거짓이라면 b가 max값
		System.out.println(max);
	}
}
