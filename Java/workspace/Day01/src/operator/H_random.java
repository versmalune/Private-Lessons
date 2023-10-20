package operator;

public class H_random {
	
	public static void main(String[] args) {
		
		System.out.println(Math.random());
		System.out.println(Math.random()*10);
		
		/*0~9까지 정수를 랜덤하게 출력*/
		System.out.println((int)(Math.random()*10));
		
		/*1~10까지 수를 랜덤하게 출력*/
		System.out.println((int)(Math.random()*10) + 1);
		
		/*1~6 까지 수를 랜덤하게 출력*/
		System.out.println((int)(Math.random()*6) + 1);
		
	}

}
