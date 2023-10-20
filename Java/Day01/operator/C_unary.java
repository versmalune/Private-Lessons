package operator;

public class C_unary {
	
	public static void main(String[] args) {
		
		/*증감 연산자: ++, --
		1) a++, ++a : a에 +1한 후, 다시 a에 저장
		2) a--, --a : a에 -1한 후, 다시 a에 저장*/

		int a = 10;
		a++;
		System.out.println(a);
		++a;
		System.out.println(a);
		a--;
		System.out.println(a);
		--a; 
		System.out.println(a);
	
		
		/*1) 전치 연산 ++a : 자신 먼저 증감시킨 뒤, 나머지 연산 수행
		2) 후치 연산 a++: 나머지 연산 먼저 수행 뒤, 마지막에 자신을 증감시킴*/
		
		a = 10;
		int b;
		b = ++a;
		System.out.println(b);
		
		
		a = 10;
		b = a++;
		System.out.println(b);
		System.out.println(a);
		System.out.println();
		
		int c = 100;
		System.out.println("현재 C의 값 : " + c++ );  // print 먼저 수행 후, c +1 더해 줌
		System.out.println(c);
		System.out.println("현재 C의 값 : " + ++c );	 // c +1 먼저 더한 후, print 실행

		
		
		
	}
	
}
