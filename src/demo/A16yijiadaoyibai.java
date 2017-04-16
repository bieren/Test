package demo;

import java.util.Scanner;

public class A16yijiadaoyibai {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = 0;
		for(int i = 1;i<=a;i++){
			b = b+i*i;
			System.out.print(i+"!");
			if(i<a){

				System.out.print("+");
			}else{
				System.out.print("=");
			}
		}
		System.out.println(b);
	}
	

}
