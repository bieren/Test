package demo;

import java.util.Scanner;

public class A08_2 {
	public static void main(String[] args){
		System.out.println("乘法口诀表");
		System.out.println("请输入您要查看的最大数");
		
		Scanner sacnner = new Scanner(System.in);
		int n = sacnner.nextInt();
		String m = n + "x" + n + "=" + n * n ;
		int l = 0;
		for(int i = 1;i <= n;i++){
			for(int j = 1; j<= n; j++){
				String a = i + "x" + j + "=" + i * j;
				l+=a.length();
				if(i == j){
					break;
				}
				for (int b = m.length() - a.length();b > 0; b-- ){
					l+=1;
				}
				l+=2;
			}
			if (i!=n){
				l=0;
			}
			for(;l>0;l--){
				System.out.println("=");
			}
			if(i==n){
				System.out.println();
			}
		}
		
		for(int i =1; i<=n;i++){
			for(int j = 1;j<=n;j++){
				String a = i + "x" + j + "=" + i * j;
				l+=a.length();
				System.out.print(a);
				if(i == j){
					System.out.println();
					break;
				}
				for(int b = m.length() - a.length();b>0; b--){
					System.out.print(" ");
					l+=1;
				}
				System.out.print("  ");
				l+=2;
			}
			if(i!=n){
				l=0;
			}
			for(;l>0;l--){
				System.out.print("=");
			}
			if(i==n){
				System.out.println();
			}
		}
	}

}
