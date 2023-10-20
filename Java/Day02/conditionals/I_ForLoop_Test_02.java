package conditionals;

public class I_ForLoop_Test_02 {

	public static void main(String[] args) {
		
		/* 실습 1. 별 출력
		*
		**
		***
		****
		*****
		- 위 모양과 똑같이 for문 사용하여 출력
		- System.out.println()보다 System.out.print() 사용이 편리함*/
		
		for (int i = 0; i < 5; i++) { // 0, 1, 2, 3, 4 (총 다섯 번)
			for (int j = 0; j <= i; j++) { // j에 +1 하면서 i 값과 같아질 때까지
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		/* 실습 2. 역순 출력
		*****
		*****
		****
		***
		**
		*
		*/
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
