package classes;

import java.util.Scanner;

class Student{ // 설계용 클래스
	String name;
	int kr, eng, math, tot;
	double avg;
	char grade;
}

public class StudentInfo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String shwMsg = 
				"1. 학생 정보 입력 \n" 
				+ "2. 학생 정보 출력 \n"
				+ "3. 합격 결과 보기 \n"
				+ "4. 프로그램 종료 ";
		
		Student s1 = new Student();
		
		menu: while(true){
			
			System.out.println(shwMsg);
			System.out.print("메뉴를 선택하세요  :  ");
			int a = sc.nextInt();
			
			switch(a){
				case 1:
					System.out.print("이름 입력  :  ");
					s1.name = sc.next();
					System.out.print("국어 점수 입력  :  ");
					s1.kr = sc.nextInt();
					System.out.print("영어 점수 입력  :  ");
					s1.eng = sc.nextInt();
					System.out.print("수학 점수 입력  :  ");
					s1.math = sc.nextInt();
					
					s1.tot = s1.kr + s1.eng + s1.math;
					s1.avg = (double)s1.tot / 3;
					
					if(s1.avg >= 90) s1.grade = 'A';
					else if(s1.avg >= 80) s1.grade = 'B';
					else if(s1.avg >= 70) s1.grade = 'C';
					else if(s1.avg >= 60) s1.grade = 'D';
					else s1.grade = 'F';
					break;
				
				case 2:
					String info = 
						"이름 : " + s1.name + "\n"
						+ "평균 : " + s1.avg + "\n"
						+ "등급 : " + s1.grade;
					System.out.println(info);
					break;
					
				case 3:
					if(s1.avg >= 85.5){
						System.out.println("합격");
					} else {
						System.out.println("불합격");
					}
					break;
				
				case 4:
					System.out.println("프로그램을 종료합니다");
					break menu;
					
				default: 
					System.out.println("오류!");
					break;
			}
		}
	}
}
