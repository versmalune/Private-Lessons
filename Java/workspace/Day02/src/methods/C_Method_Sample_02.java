package methods;

public class C_Method_Sample_02 {
	
	static void method1(){
		System.out.println("m1 실행");
	}
	static void method2(int x){
		System.out.println("method2를 이용하여 " + x + "가 출력됨");
	}
	static int method3(){
		System.out.println("method3 실행됨");
		return 10;
	}
	static void method4(int x , int y){
		System.out.println("method4를 통하여 " + x + "과 " + y + " 더한 값 출력");
	}
	static int method5(int y){
		System.out.println("method5를 통하여 " + y + "값 출력");
		return y*2;
	}

	
	public static void main(String[] args) {
		method1();
		System.out.println();
		
		method2(5);
		System.out.println();
		
		method3();
		System.out.println();
		int a = method3();
		System.out.println(a);
		System.out.println();
		
		method4(3, 5);
		System.out.println();
		
		method5(10);
		System.out.println();
		int b = method5(10);
		System.out.println(b);
		System.out.println();
	}
}
