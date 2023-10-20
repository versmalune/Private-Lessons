package conditionals;

import java.util.Scanner;

public class D_SwitchCase_Test_01 {

	/*실습: 달(month)을 정수로 입력받아서 그 달에 총 며칠이 있는지 출력하는 switch case문 만들기
	- 1, 3, 5, 7, 8, 10, 12월 : 31일
	- 2월 : 28일
	- 4, 6, 9, 11월 : 30일*/
	
	public static void main(String[] args) {
		
		System.out.println("달을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		String message;
		
		switch(month){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				message = month + "월은 31일까지 있습니다.";
				break;
			case 2:
				message = month + "월은 28일까지 있습니다.";
				break;
			case 4: case 6: case 9: case 11:
				message = month + "월은 30일까지 있습니다.";
				break;
			default:
				message = "해당 월은 존재하지 않습니다.";
		}
		System.out.println(message);

	}
}
