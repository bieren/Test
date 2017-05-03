package a.a1;

import java.util.Scanner;


public class A006_wuxianjisuanqi {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		
		while (true) {
			
		
		String B = scanner.next();
		if ("=".equals(B)) {
			
			System.out.println(A);
			return;
		}
		int C = scanner.nextInt();
		
		if ("+".equals(B)) {
			A = A + C;
			System.out.println(A);
		}else if("-".equals(B)){
			A = A - C;
			System.out.println(A);
		}else if("*".equals(B)){
			A = A * C;
			System.out.println(A);
		}else if("/".equals(B)){
			A = A / C;
			System.out.println(A);	
		}else if("%".equals(B)){
			A = A % C;
			System.out.println(A);
		}else {
			System.out.println("输入错误");
			return;
		}
		
		
		}
	}
}
