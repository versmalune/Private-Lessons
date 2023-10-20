package operator;

public class G_casting_test {
	
	public static void main(String[] args) {
		
		/*실습 : 평균이 60.2 이상이면 합격! 그렇지 않으면 불합격!을 출력*/
		
		int kr = 60;
		int eng = 60;
		int math = 61;
		String msg;
		String msg1;
		
		float kr2 = 60.0f;
		float eng2 = 60.0f;
		float math2 = 61.0f;
		
		msg = (kr + eng + math) / 3.0 >= 60.2 ? "합격" : "불합격" ;
 
		
		System.out.println(msg);

	}

}
