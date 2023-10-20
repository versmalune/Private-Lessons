package array;

public class B_PrimitiveArray_Test {
	/* 배열 실습
	int형 6개짜리 배열 1개 생성
	확장 for문 사용하여 순서대로 1,2,3,4,5,6 값이 저장되도록 해 보세요*/
	
	public static void main(String[] args) {
		
		int[] arr = new int[6];
		
		// #1. 확장 for문
		int x = 1;
		
		for(int i : arr) {
			i = x;
			x++;
			System.out.println(i);
		}
		
		System.out.println();
		
		
		// #2. for문
		int y = 1;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = y;
			y++;
			System.out.println(i);
		}

	}

}
