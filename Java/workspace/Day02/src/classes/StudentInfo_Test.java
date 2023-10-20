package classes;

import javax.swing.JOptionPane;

class Student1{	// 설계용 클래스
	String name;
	int kr, en, ma, tot;
	double avg;
	char grade;
}


public class StudentInfo_Test {	// 메인용 클래스
	
	public static void main(String[] args) {
		String shwMsg = 
				"1. 학생 정보 입력 \n" 
				+ "2. 학생 정보 출력 \n"
				+ "3. 합격 결과 보기 \n"
				+ "4. 프로그램 종료 ";
		
		// 정보 저장할 객체 1개 생성 
		Student1 s1 = new Student1();
		
		menu: while(true){
			String ans = JOptionPane.showInputDialog(shwMsg);
			
			switch(ans){
				case "1":
					s1.name = JOptionPane.showInputDialog("이름 입력");
					String kr = JOptionPane.showInputDialog("국어 입력");
					s1.kr = Integer.parseInt(kr);
					String en = JOptionPane.showInputDialog("영어 입력");
					s1.en = Integer.parseInt(en);
					String ma = JOptionPane.showInputDialog("수학 입력");
					s1.ma = Integer.parseInt(ma);
					
					s1.tot = s1.kr + s1.en + s1.ma;
					s1.avg = (double)s1.tot / 3;
					
					if(s1.avg >= 90) s1.grade = 'A';
					else if(s1.avg >= 80) s1.grade = 'B';
					else if(s1.avg >= 70) s1.grade = 'C';
					else if(s1.avg >= 60) s1.grade = 'D';
					else s1.grade = 'F';
					JOptionPane.showMessageDialog(null, "저장 완료!");
					break;
				
				case "2":
					String info = 
						"이름 : " + s1.name + "\n"
						+ "평균 : " + s1.avg + "\n"
						+ "등급 : " + s1.grade;
					JOptionPane.showMessageDialog(null, info);
					break;
					
				case "3":
					if(s1.avg >= 85.5){
						JOptionPane.showMessageDialog(null, "합격");
					} else {
						JOptionPane.showMessageDialog(null, "불합격");
					}
					break;
					
				case "4":
					JOptionPane.showMessageDialog(null,"프로그램을 종료합니다.");
					break menu;
					
				default: 
					JOptionPane.showMessageDialog(null, "잘못 입력!");
			}
		}
	}	
}