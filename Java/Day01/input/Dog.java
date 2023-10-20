package input;

import javax.swing.JOptionPane;

public class Dog {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("이름을 입력하세요");
		String tmp = JOptionPane.showInputDialog("나이를 입력하세요");
		int age = Integer.parseInt(tmp);

		
		System.out.println(name);
		System.out.println(age);
		JOptionPane.showMessageDialog(null, "이름:" + name + " 나이:" + age, "DOG INFO", 2);
		JOptionPane.showConfirmDialog(null, "강아지 정보 잘 보셨나요?");
	}
}
