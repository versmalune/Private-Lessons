package classes;

public class Person_Test {
	
	public static void main(String[] args) {
		
		//객체 생성
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
	
		
		//객체 디폴트 값: 숫자=0, 문자열=null, boolean=false
		System.out.println(p1.age);
		System.out.println(p1.name);
		System.out.println(p1.hasPhone);
		System.out.println();
		

		//객체의 인스턴스 변수 접근
		p1.name = "김초코";
		p1.age = 5;
		p1.hasPhone = true;
		
		p2.name = "이또또";
		p2.age = 4;
		p2.hasPhone = false;
		
		p3.name = "박해피";
		p3.age = 6;
		p3.hasPhone = true;
		
		//객체의 인스턴스 변수 값 출력
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.hasPhone);
		System.out.println("============");
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.hasPhone);
		System.out.println("============");
		System.out.println(p3.name);
		System.out.println(p3.age);
		System.out.println(p3.hasPhone);
	}

}
