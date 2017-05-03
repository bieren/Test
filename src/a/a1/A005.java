package a.a1;

import java.util.Scanner;

public class A005 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入第一个数字");
		int A = in.nextInt();
		System.out.println("请输入第二个数字");
		int B = in.nextInt();
		System.out.println(c.Human.FIELDS);
		
		
		if( A > B){
			int c = A;
			A = B;
			B = c;
			System.out.println("第一个数字是 "+A+"第二个数字是 "+B);
		}else if(A <= B ){
			System.out.println("第一个数字是 "+A+"第二个数字是 "+B);
		}
	}
}
