package operator;

public class E_logical {
	
public static void main(String[] args) {
		
		/*논리연산자 : && , || , ! => boolean type으로 결과 나옴 

		(1) && : 논리곱연산자 (논리 AND 연산자)
		    - 양 수식이 모두 참이어야 true
		    - 하나라도 거짓이면 false
		    - 앞 수식이 '거짓'이면 다음 수식은 무시함
		 
		(2) || : 논리합연산자 (논리 OR 연산자)
		    - 양 수식 중 하나라도 참이면 true
		    - 양 수식 중 하나라도 참이면 true
		    - 앞 수식이 '참'이면 다음 수식은 무시함
		    
		(3) ! : 논리부정연산자 ( 논리 NOT 연산자 )
			- 수식이 참이면 false를, 거짓이면 true 반환*/
	
		boolean a;
		
		a = 10 > 20 && 15 < -5; 
		System.out.println(a);
		System.out.println();
		
		
		a = 10 < 20 || 15 < -5;
		System.out.println(a);
		System.out.println();
		
		long l = 1;
		a = l > 10 && ++l == 2;
		System.out.println(l); // ++ 실행 되지 않은 것을 확인 => && 앞 수식이 거짓이어서 다음 수식 무시함
		System.out.println(a);
		System.out.println();
		
		boolean b = !(10 == 20); //틀렸는지 확인 => 틀렸으면 true
		System.out.println(b);
	}


}
