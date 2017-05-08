package a.a1;

import java.util.Scanner;

public class A013_c {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入你需要计算的数");
		int a = in.nextInt();
		
		for(int i =0,j = a ; i <= a; i++,j--){
			String c = i+"+"+j+"="+(i+j);
			int l=c.length();
//			System.out.println(i+"+"+j+"="+(i+j));
			
//			System.out.println(l);
			if(i < 10 ){
				System.out.print(" "+i);
			}else {
				System.out.print(i);
			}
			System.out.print("+");
			if(j < 10 ){
				System.out.print(" "+j);
				
			}else {
				System.out.print(j);
			}
			System.out.println("="+(i+j));
		}
		
	}
}
