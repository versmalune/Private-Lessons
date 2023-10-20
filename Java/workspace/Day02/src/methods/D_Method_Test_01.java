package methods;

import java.util.Scanner;

public class D_Method_Test_01 {
	
	static void starMaker(int a) {
		//System.out.println('*' * a);
		
		for(int i = 0; i < a; i++) {
			System.out.print("*");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		starMaker(a);
	}

}
