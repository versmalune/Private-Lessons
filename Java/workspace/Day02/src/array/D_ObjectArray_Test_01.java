package array;

import java.util.Scanner;

public class D_ObjectArray_Test_01 {
	/*
	메인 메소드용 클래스 1개, 설계용 클래스 1개 (Person.java)
	- 2개짜리 배열을 생성
	- 객체의 배열을 사용하여 이름,나이,성별을
	각 객체의 배열에 저장
	출력 예시)
		1번
		이름 :피카츄
		나이 :12
		성별:남자
		===========
		2번
		이름 :푸린
		나이 :15
		성별:여자
		*/
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Person[] p = new Person[2];
		p[0] = new Person();
 		p[1] = new Person();
 		
 		for(int i = 0; i < p.length ; i++){
 			System.out.println("이름을 입력하세요  :");
			p[i].name = sc.next();
			System.out.println("나이를 입력하세요  :");
			p[i].age = sc.nextInt();
			System.out.println("성별을 입력하세요  :");
			p[i].gender = sc.next();
			}
 		
 		
 		String shwMsg = "";
 		
 		for(int i = 0; i < p.length; i++) {
 			
 			shwMsg += i+1 + "번\n" 
 					+ "이름 : " + p[i].name + "\n"
 					+ "나이 : " + p[i].age + "\n"
 					+ "성별 : " + p[i].gender + "\n"
 					+ "============== \n";
 			
 			System.out.println(shwMsg);
 		}
 		
 		for(Person x : p) {
 			System.out.println(x.name);
 			System.out.println(x.age);
 			System.out.println(x.gender);
 		}
	}	
}