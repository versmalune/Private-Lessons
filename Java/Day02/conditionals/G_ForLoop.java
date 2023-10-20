package conditionals;

public class G_ForLoop {
	
	public static void main(String[] args) {
		
		// 1. 1~10 출력
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		
		// 2. 30~100 총합 구하기
		int sum = 0;
		for (int i = 30; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println();
		
		
		// 3. Break
		for (int i = 10; i >= 0; i--) {
			if (i % 3 == 0) {
				break; //제어문 종료!
			}
			System.out.println(i);
		}
		System.out.println();
		
		
		// 4. Continue
		for (int i = 10; i >= 0; i--) {
			if (i % 3 == 0) {
				continue; //다음 단계 실행!
			}
			System.out.println(i);
		}
	}
}
