package demo;

import java.util.Scanner;

public class A12_liuweishu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();


		
		//十万位
		int f = x/100000;
		//万位数
		int e = (x-f*100000)/10000;
		//千位数
		int a = (x-f*100000-e*10000)/1000;
		int b = (x-f*100000-e*10000-a*1000)/100;
		int c = (x-f*100000-e*10000-a*1000-b*100)/10;
		int d = x%10;
		
		int y = d*100000+c*10000+b*1000+a*100+e*10+f;
		System.out.print(y);
	}
}

//123456
