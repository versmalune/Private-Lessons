package conditionals;

public class H_ForLoop_Test_01 {
	
	/*실습: 구구단 홀수단(1, 3, 5, 7, 9단) / 짝수단(2, 4, 6, 8단) 출력
		- 이중 for문 사용하여 출력
		- 기타 제어문 사용해야 가능!*/
	
	public static void main(String[] args) {
		
		for (int i = 1; i < 10; i ++) {
			System.out.println("\n");
			for (int a = 1; a < 10; a++) {
				if (i%2 == 0)
					continue;
				System.out.println(i + "x" + a + "=" + i*a);
			}
		}
	}

}
