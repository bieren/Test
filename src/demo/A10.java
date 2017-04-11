package demo;

import java.util.Scanner;

public class A10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			//十位数
			int n = a/10;
			//个位数
			int m = a-n*10;
			//交换后的数
			int b = m*10+n;
			System.out.print(b);
					
					
//					
//			12 = 1*10 + 2
//			21 = 2*10 + 1
//			n m
//			m n
					
	}
}
