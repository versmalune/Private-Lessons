package array;

public class C_ObjectArray {

	public static void main(String[] args) {
		
		//배열 생성
		Person[] p;
		p = new Person[3];
		
		//객체 생성 및 배열에 연결
		p[0] = new Person();
		p[1] = new Person();
		p[2] = new Person();
		
		//객체 접근
		p[0].name = "홍길동";
		p[0].age = 10;
		p[0].gender = "남자";
		
		System.out.println(p[0].name);
		System.out.println(p[0].age);
		System.out.println(p[0].gender);
		System.out.println();
		System.out.println(p[1].name);
	}

}
