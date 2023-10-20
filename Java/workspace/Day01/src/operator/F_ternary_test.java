package operator;

public class F_ternary_test {
	
	public static void main(String[] args) {
		
		/*실습 : age 값을 임의로 저장한 후, 19 이하는 미성년자 / 이상은 성인을 str에 저장하고 출력*/
		
		int age = 19;
		String str;
		str = age <= 19 ? "미성년자" : "성인";
		System.out.println(str);
	}
}
