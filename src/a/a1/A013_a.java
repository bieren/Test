package a.a1;

import java.util.Scanner;

public class A013_a {
//	public void loop(int a){
//		
//		for (int i = 0; i < 5; i++) {
//			System.out.println("请输入您的第一门课的成绩");
//			
//		}
//	}
	
	public static void main(String[] args) {
		Scanner sacnner = new Scanner(System.in);
		A013 a013a = new A013();
		int aa = 0;

		for ( int i =0; i < 5; i++) {
			System.out.println("请输入你的第"+i+"门成绩");
			int a = sacnner.nextInt();
			aa = aa + a ;
			if(i == 5){
				int Average = aa /i;
				System.out.println("你的平均分是："+Average);
			}
		}

		
	}
}
