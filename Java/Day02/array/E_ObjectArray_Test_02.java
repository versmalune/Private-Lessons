package array;

import java.util.Scanner;

class Pet {
	String name;
	int month;
	String type;	
	boolean hungry = true;
}

public class E_ObjectArray_Test_02{

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String shwMsg = 
				"1. Pet 등록하기\n"
				+"2. Pet 정보보기\n"
				+"3. Pet 먹이주기\n"
				+"4. 프로그램 종료하기";
		
		Pet[] p = new Pet[5];
		
		int count = 0;
		
		menu : while(true) {
			System.out.println(shwMsg);
			System.out.print("메뉴를 선택해 주세요: ");
			int menu = sc.nextInt();
			
			switch(menu){
			case 1:
				if (count == 5){
					System.out.println("더 이상 기를 수 없습니다!");
				} else {
					p[count] = new Pet();
					System.out.print("이름을 입력하세요  :");
					p[count].name = sc.next();
					System.out.print("개월 수를 입력하세요  :");
					p[count].month = sc.nextInt();
					System.out.print("종류를 입력하세요  :");
					p[count].type = sc.next();
					System.out.println(p[count].name+"을(를) 등록했어요~");
					count++; 
					System.out.println();
				}
				break;
			case 2:
				if(count != 0){
					String shwData = "";
					for(int i = 0; i < count; i++){
						shwData += 
								"이름 : " + p[i].name + "\n"
								+"종류 : " + p[i].type + "\n"
								+"개월 수 :" + p[i].month + "개월 \n"
								+"배고픔 :"+p[i].hungry +"\n"
								+"========================\n";
					}
					System.out.println(shwData);
					
					String who="< 현재 배고픈 pet >\n";
					double avg = 0;
					for(int i = 0; i<count; i++){
						if(p[i].hungry == true){
							who += p[i].name + "\n";
						}
						avg += p[i].month;
					}
					avg /= count; 
					System.out.println(who);
					System.out.println("평균  :" + avg + "개월");
					System.out.println();
				} else {
					System.out.println("기르는 펫이 없습니다.");
				}
				break;
				
			case 3:
				System.out.println("누구에게 밥을 줄 건가요?");
				String name = sc.next();
				for(int i = 0; i < count; i++){
					if(name.equals(p[i].name)){ 
						if(p[i].hungry == false) {
							System.out.println("이미 먹었어요!");
						} else {
							p[i].hungry = false;
							System.out.println(p[i].name + "에게 먹이를 주었습니다.");	
						}
					}
				}
				break;
				
			case 4:
				String aa = "";
				for(int i = 0; i<count; i++){
					aa += p[i].name + " ";
				}
				System.out.println(aa + "(이)가 슬퍼합니다. 그래도 가시겠어요? YES/NO");
				String answer = sc.next();
				if(answer.equals("YES")){
					break menu;
				}
				
			default:
				System.out.println("잘못 입력!!");
			}
		}
	}

}
