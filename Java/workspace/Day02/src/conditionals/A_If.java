package conditionals;

public class A_If {

	public static void main(String[] args) {
		
		int s1 = (int)(Math.random()*10);
		
		if (s1 % 2 == 0){
			System.out.println(s1 + "은(는) 짝수입니다.");
		} else {
			System.out.println(s1 + "은(는) 홀수입니다.");
		}

		
		System.out.println();
		
		
		int s2 = (int)(Math.random()*5)+1;
		
		if (s2 == 1) {  // 이중에 1개의 조건만 실행
			System.out.println("s2는 1 입니다.");
		} else if (s2 == 2) {
			System.out.println("s2는 2입니다.");
		} else if (s2 == 3) {
			System.out.println("s2는 3입니다.");
		} else if (s2 == 4) {
			System.out.println("s2는 4입니다.");
		} else if (s2 == 5) {
			System.out.println("s2는 5입니다.");
		} else {
			System.out.println("범위 외의 수입니다.");
		}
	}

}
