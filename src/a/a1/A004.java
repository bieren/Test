package a.a1;

import java.util.Scanner;

public class A004 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入你喜欢的整数");
		int A = in.nextInt();
		System.out.println("请输入你喜欢的第二个整数");
		int B = in.nextInt();
		if(A > B){
			System.out.println("第一个数 "+A+"比第二个数 "+B+"大");
		}else if(B > A){
			System.out.println("第二个数 "+B+"比第一个数 "+A+"大");
		}else if(A == B){
			System.out.println("你输入的"+A+"一样大");
		}
	}

}
