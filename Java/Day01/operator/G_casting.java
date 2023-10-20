package operator;

public class G_casting {
	public static void main(String[] args) {
		
		/*Cast 연산자
		- Type Casting: 데이터의 자료형을 바꾸는 것
		- 주용도 : int형 데이터를 실수형으로 바꿀 때
		- 강제 형변환 : 개발자가 원하는 대로 (강제로) 형변환 => Cast연산자 사용
		            ex) (원하는 자료형)바꿀 데이터
		- 자동 형변환 : 컴퓨터가 자동으로 (어쩔 수 없는 상황에서) 형변환*/
		
		double d;
		d = 3; //자동 형변환: 3을 3.0으로 형변환 뒤 d에 저장
		System.out.println(d);
		System.out.println();
		
		int i = (int)3.14; //3.14를 int형으로 강제 casting하고, i에 저장
		System.out.println(i);
		System.out.println();
		
		System.out.println((int)'A'); //A의 정수 값 (ASCII 코드) = 65
		System.out.println();
		
	
}
	
}
