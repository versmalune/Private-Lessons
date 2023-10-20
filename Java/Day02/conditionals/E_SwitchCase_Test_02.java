package conditionals;

import java.util.Scanner;

public class E_SwitchCase_Test_02 {
	
	/*실습: 컴퓨터와 가위 바위 보 게임 하기
	- 가위는 0, 바위는 1, 보는 2
	- 사용자 선택으로 셋 중에 하나를 입력받고, 컴퓨터는 자동으로 선택하기 (Math.random() 이용)
	- 사용자가 가위, 바위, 보 낸 케이스로 분류하고, 그 안에서 컴퓨터의 선택값에 따라 이겼는지 졌는지 출력   
	- 사용자의 선택값, 컴퓨터의 선택값도 출력
	ex) 사용자는 바위! 컴퓨터는 가위! 이겼습니다!*/
	public static void main(String[] args) {
		
		System.out.println("가위는 0, 바위는 1, 보는 2 \n셋 중에 입력하세요 :");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int com = (int)(Math.random()*3); //0,1,2 중 랜덤 생성
		
		switch(a){
			case 0:
				System.out.println("사용자는 가위!");
				if (com == 0){
					System.out.println("컴퓨터는 가위!");
					System.out.println("비겼습니다!");
				}
				if (com == 1){
					System.out.println("컴퓨터는 바위!");
					System.out.println("졌습니다!"); 
				}
				if (com == 2){
					System.out.println("컴퓨터는 보!");
					System.out.println("이겼습니다!");
				}
				break;
				
			case 1:
				System.out.println("사용자는 바위!");
				if (com==0) {
					System.out.println("컴퓨터는 가위!!");
					System.out.println("이겼습니다!");
				}
				if (com==1) {
					System.out.println("컴퓨터는 바위!!");
					System.out.println("비겼습니다!");
				}
				if (com==2) {
					System.out.println("컴퓨터는 보!!");
					System.out.println("졌습니다!");
				}
				break;
				
			case 2:
				System.out.println("사용자는 보!");
				if (com==0) {
					System.out.println("컴퓨터는 가위!!");
					System.out.println("졌습니다!");
				}
				if (com==1) {
					System.out.println("컴퓨터는 바위!!");
					System.out.println("이겼습니다!");
					}
				if (com==2) {
					System.out.println("컴퓨터는 보!!");
					System.out.println("비겼습니다!");
					}
				break;
				
			default:
				break;
		}
	}
}