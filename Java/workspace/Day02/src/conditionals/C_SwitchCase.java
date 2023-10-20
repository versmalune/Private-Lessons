package conditionals;

public class C_SwitchCase {
	
	public static void main(String[] args) {
		
		int a = (int)(Math.random()*1000)+1; // 1 ~ 1000까지 랜덤
		
		switch(a%2){
			case 0: 	
				System.out.println(a + " 은(는) 짝수입니다.");
				break;
			case 1:
				System.out.println(a + " 은(는) 홀수입니다.");
				break;
			default: // 모든 case에 해당하지 않을 경우 무조건 실행시키는 레이블 
				System.out.println(a + " 은(는) 짝수도, 홀수도 아닙니다.");
		}

	}
}
