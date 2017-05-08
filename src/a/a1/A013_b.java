package a.a1;

import java.util.Scanner;

public class A013_b {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n  = scanner.nextInt();
		if(n > 0){
			int a = 0;
			
			//a 是结果
			// 	
			for (int i = 1; i < n+1; i++) {
				
					a = a+i;
					System.out.print(i+"+");
				if(i == n){
					System.out.print("(n-1)+n"+"="+(a+(n-1)+n));
				}
			}
		}
	}
}
