package demo;

import java.util.Scanner;

public class A17chouchushuzu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int a = x/100000;
		int b = (x-a*100000)/10000;
		int c = (x-a*100000-b*10000)/1000;
		int d = (x-a*100000-b*10000-c*1000)/100;
		int e = (x-a*100000-b*10000-c*1000-d*100)/10;
		int f = x%10;
		int g = f*100000+e*10000+d*1000+c*100+b*10+a;
		System.out.println(g);
	}
}