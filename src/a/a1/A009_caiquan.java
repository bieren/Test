package a.a1;

import java.util.Scanner;

public class A009_caiquan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1，2，3，喜欢哪个输入哪个");
		String boxing1 = scanner.next();
		int boxing = 0;
		try {
			boxing = Integer.parseInt(boxing1);

			// if(boxing != 1 || boxing != 2 || boxing != 3){
			if (boxing < 1 || boxing > 3) {
				System.out.println("请不要输入其他数字");
			}

		} catch (Exception e) {
			System.out.println("你输入的并不是1，2，3");
			return;
		}
		switch (boxing) {
		case 1:
			System.out.println("你出的剪刀，残念我出的是石头");
			break;
		case 2:
			System.out.println("你出的石头，残念我出的是布");
			break;
		case 3:
			System.out.println("你出的是布，残念我出的是剪刀");
			break;
		}
	}
}
