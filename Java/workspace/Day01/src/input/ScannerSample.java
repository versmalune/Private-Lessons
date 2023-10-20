package input;
import java.util.Scanner;

public class ScannerSample {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요: ");
		int a = sc.nextInt();
		System.out.println(a);
		
		System.out.print("문자를 입력하세요: ");
		String b = sc.next();
		System.out.println(b);

		
	}
}