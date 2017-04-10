package demo;

import java.util.Scanner;


/**
 * 打印出一个正方形
 * @author Administrator
 *
 */
public class A09 {

	
	/**
	 * 失败
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int b = scanner.nextInt();// 字符串长度
		int m = 0;
		
		for (int j = 0; j <= b; j++) {
			if (j==0) {
				for (int i = 0; i < b; i++) {
					
					System.out.print("*");
					m++;
					if (i<b-1) {
						System.out.print(" ");
						m++;
					}
					
				}
				
				System.out.println();
			}
			
			
			for (int i = 0; i <= b; i++) {
				if (i==0) {
					System.out.print("*");
				}
				
				if (i!=0 && i!=b) {
					for (int k = 0; k <= b-2; k++) {
						System.out.print(" ");
					}
					
				}
				
				if (i==b) {
					System.out.print("*");
				}
				
				
			}
			
			

			
			
			
			
			
			
				System.out.println();
			
			if (j==b) {
				for (int i = 0; i < b; i++) {
					
					System.out.print("*");
					if (i<b-1) {
						System.out.print(" ");
					}
					
				}

			}
			
			
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	/**
	 * 失败
	 * 当长度为5或2时可以完美显示
	 * @param args
	 */
	public static void main2(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int b = scanner.nextInt();// 字符串长度

		// 第一行 宽
		for (int i = 0; i < b; i++) {
			if (i!=0) {
				System.out.print(" ");
			}
			
			System.out.print("*");
		}

//======================================================================
		// 换行
		System.out.println();

		// 长
		for (int i = 1; i <= b-2; i++) {
			//左边
			
			for (int j = 0; j < b; j++) {
				if (j == 0) {
					System.out.print("*");
				}
			}
		
			
			//中间空白
			if (i>0 && i<=b) {
				for (int j = 0; j < b-2; j++) {
					if (j!=0 && j<b-2) {
						System.out.print(" ");
					}
					System.out.print(" ");
				}
			}
			
			
			
			//右边
			for (int j = 0; j < b; j++) {
				if (j!=0 && j<b-2) {
					System.out.print(" ");
				}
				if (j == b-1) {
					System.out.print("*");
				}
			}
			
			//换行
			System.out.println();
			
		}

//======================================================================
		// 底行 宽
		for (int i = 0; i < b; i++) {
			if (i!=0) {
				System.out.print(" ");
			}
			System.out.print("*");
		}

	}

	public static void main1(String[] args) {
		System.out.println("******************");
		System.out.println("*                *");
		System.out.println("*                *");
		System.out.println("*                *");
		System.out.println("*                *");
		System.out.println("*                *");
		System.out.println("*                *");
		System.out.println("******************");

	}

}
