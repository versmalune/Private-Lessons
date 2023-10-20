package datatype;

public class B_datatypes {

	public static void main(String[] args) {

		/*1. integral type
		  1) int
		  2) long   */
		System.out.println(1);
		System.out.println(300);
		//System.out.println(22000000000); 에러 발생
		System.out.println(22000000000L);
		System.out.println("");
		
		
		
	  /*2. floating point type
		1) double
		   - 한 실수당 8 byte
		2) float
		   - 한 실수 당 4 byte
		   - 오차 범위가 double보다 커서 잘 안 씀*/
		System.out.println(1.0);
		System.out.println(3.14342423432);
		System.out.println(3.14d); // double
		System.out.println(3.14f); // float
		System.out.println("");
		
		
		
	  /*3. char type (문자 1개, '' 사용)
		   - 한 문자당 2 byte
		   - ASCII 코드 (1 byte): 알파벳 대소문자, 0~9, 특수 문자
		   - UNICODE (2 byte): 모든 국가의 문자들, 기타 특수 문자*/
		System.out.println('A');
		System.out.println('a');
		System.out.println('가');
		System.out.println('1');
		System.out.println((int)'A'); //ASCII 코드
		System.out.println((int)'1'); //ASCII 코드
		//System.out.println('가나다'); 에러
		System.out.println("");
		
		
		
	 /*4. string (문자 여러 개, "" 사용)
	       - 자료형처럼 사용되는 특별 케이스 */
		System.out.println("ABCDE");
		System.out.println("안녕");
		System.out.println("1");
		System.out.println("");
		
		
		
	 /*5. boolean type*/
		System.out.println(true);
		System.out.println(false);
		
		System.out.println("true");
		System.out.println("false");

	}
}