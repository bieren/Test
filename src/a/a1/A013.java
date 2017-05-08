package a.a1;

import java.util.Scanner;

public class A013 {
	public int reverse(int number) {
		int result = 0;
		int  aa = 0 ;
		while (number != 0) {
			result = number % 10;
//			System.out.print(result);
			aa =aa * 10 + result;
			number = number / 10;
					
		}
		return aa;
	}

	public static void main(String[] args) {
		Scanner sacnner = new Scanner(System.in);
		System.out.println("请输入您需要调换的数字");
		A013 a013 = new A013();
		int number = sacnner.nextInt();
		
		
		int value = a013.reverse(number);

//		while (number != 0) {
//			int result = number % 10;
//			System.out.print(result);
//			number = number / 10;
//		}
		
		System.out.println(value);
		System.out.println("\n您需要调换的数字已经调换完毕");
	}

}
