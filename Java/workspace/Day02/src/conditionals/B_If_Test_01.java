package conditionals;

import java.util.Scanner;

public class B_If_Test_01 {
	
	/* 실습: 스캐너 클래스를 이용하여 이름과 나이를 입력받고, 가야 할 학교를 선택하여 출력하세요
		4살 이상 7살 이하: 유치원
		8살 이상 13세 이하: 초등학교
		14세 이상 16세 이하: 중학교
		17세 이상 19세 이하: 고등학교
		이외: 해당 사항 없음
		(출력 예: 김초코는 5살이므로 유치원을 가야 합니다.)*/
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		String school;
		
		if(age >= 4 && age <= 7)
			school = "유치원";
		else if(age >= 8 && age <= 13)
			school = "초등학교";
		else if(age >= 14 && age <= 16)
			school = "중학교";
		else if(age >= 17 && age <= 19)
			school = "고등학교";
		else school = "해당사항없음";
		
		System.out.println(name + " 은 " + age + "살이므로 " + school + "를 가야 합니다.");
	}
}
