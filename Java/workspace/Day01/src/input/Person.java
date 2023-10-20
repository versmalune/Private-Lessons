package input;
import java.util.Scanner;

public class Person {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int age;
		String name;
		String gender;
		
		System.out.print("나이를 입력하세요: ");
		age = sc.nextInt();
		System.out.print("이름을 입력하세요: ");
		name = sc.next();
		System.out.print("성별을 입력하세요: ");
		gender = sc.next();
		
		System.out.println("================");
		System.out.println("나이: " + age);
		System.out.println("이름: " + name);
		System.out.println("성별: " + gender);
	}
}