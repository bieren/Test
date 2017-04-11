package demo;

import java.util.Scanner;

public class A13_zuidazuixiao {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = 1 ;
		int b = 2 ;
		int c = 3 ;
		if(a>b){
			if(a>c){
				System.out.print("13 a最大");
			}
			
			if(a<c){
				System.out.print("17 c最大");
			}
				
		}
		
		
		if(b>a){
			if(b>c){
				System.out.print("25 b最大");
			}
			if(b<c){
				System.out.print("28 c最大");
				return;
			}
		}
		
		
		if(c>a){
			if(c>b){
				System.out.print("35 c最大");
			}
			if(c<b){
				System.out.print("38 b最大");
			}
		}
		
	}
}
