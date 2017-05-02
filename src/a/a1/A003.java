package a.a1;

import c.Human;

public class A003 {
	public static void main(String[] args) {
		int A = 45;
		int B = 78;
		int t = A;
		A = B;
		B = t;
		//Integer :对象类型的数量
		Integer i = 1;
		//toString :转换为字符串
		i.toString();
		String a = "11";
		
		Human human =new Human();
		human.toString();
		
		Object o = new Object();
		o.toString();
		System.out.println(i.toString()+1);
		System.out.println(human.toString()+1);
		System.out.println(o.toString()+1);
		
		
		
		System.out.println("A="+A+"\nB="+B);
	}
}
