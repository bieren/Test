package demo;

import java.util.Scanner;

public class A11_siweishu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		
		//千位数
		int a = x/1000;
		//百位数
		int b = (x-a*1000)/100;
		//十位数
		int c = (x-a*1000-b*100)/10;
		//个位数
		int d = x%10;
		
		int y = d*1000+c*100+b*10+a;
		System.out.print(y);
	}
}




//
//			X  = 1234
//			1234-1*1000=234
//			234/100

//			4321