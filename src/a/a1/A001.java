package a.a1;

import java.util.Scanner;

public class A001 {
	public static void main(String[] args) {

		while (true) {
			Scanner in = new Scanner(System.in);
			System.out.println("请输入你的姓名");
			String name = in.next();
			System.out.println("请输入你的性别");
			String Gender = in.next();
			System.out.println("请输入你的年龄");

			int age = in.nextInt();
			System.out.println("你的名字是:" + name);
			System.out.println("你的性别是:" + Gender);
			System.out.println("你的年龄是:" + age);

			System.out.println("以上资料是否属实\n Y/N");
			String m = in.next();
			if ("Y".equals(m)) {
				System.out.println("你是猪吗叫你回答什么就回答什么");
				return;
			} else if ("N".equals(m)) {
				System.out.println("请重新启动并输入资料");
			}
		}
	}

}
