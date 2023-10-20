package methods;

public class A_Method {
	public void method1(){
		System.out.println("m1 실행");
	}
	public void method2(int x){
		System.out.println("method2를 이용하여 " + x + "가 출력");
	}
	public int method3(){
		System.out.println("m3 실행");
		return 10;
	}
	public void method4(int x , int y){
		System.out.println("method4를 통하여 " + x + "과 " + y + " 더한 값 출력");
	}
	public int method5(int y){
		System.out.println("method5를 통하여 " + y + "값 출력");
		return y*2;
	}
}
