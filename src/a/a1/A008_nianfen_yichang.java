package a.a1;

import java.util.Scanner;

public class A008_nianfen_yichang {
	public static void main(String[] args) {
		// String year1 = "a";

		Integer a = 0;
		int b = 1;
		a = b;
		a = null;

		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你想知道的年份");
		String year1 = scanner.next();

		if (!year1.equals("0")) {

			int year = 0;

			try {
//try{代码可能产生的异常类型}catch(**Exception e ) {捕抓到异常后进行的运行}
				year = Integer.parseInt(year1);
//Exception : 囊括所有异常
			} catch (Exception e) {
				System.out.println("你输入的不是数字");
				return;
			}

			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				System.out.println("你输入的" + year + "年份是闰年");
			} else
				System.out.println("你输入的" + year + "是平年");
			return;
		} else {
			System.out.println("你输入的" + "0" + "年份是平年");
			return;
		}

	}

}
