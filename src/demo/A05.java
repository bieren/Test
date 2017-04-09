package demo;
import java.util.Scanner;

public class A05 {
	public static void main(String[] args) {
		System.out.println("请输入选择的月份");
		while(true){
			Scanner scanner = new Scanner(System.in);
			int n = scanner.nextInt();
			switch(n){
				case 1:{
					System.out.println("您选择的是1月份");
					break;
				}
				case 2:{
					System.out.println("您选择的是2月份");
					break;
				}
				case 3:{
					System.out.println("您选择的是3月份");
					break;
				}
				case 4:{
					System.out.println("您选择的是4月份");
					break;
				}
				case 5:{
					System.out.println("您选择的是5月份");
					break;
				}
				case 6:{
					System.out.println("您选择的是6月份");
					break;
				}
				case 7:{
					System.out.println("您选择的是7月份");
					break;
				}
				case 8:{
					System.out.println("您选择的是8月份");
					break;
				}
				case 9:{
					System.out.println("您选择的是9月份");
					break;
				}
				case 10:{
					System.out.println("您选择的是10月份");
					break;
				}
				case 11:{
					System.out.println("您选择的是11月份");
					break;
				}
				case 12:{
					System.out.println("您选择的是12月份");
					break;
				}
				case 88:{
					System.out.println("再见");
					return;
				}
				default:{
					System.out.println("没有您选择的月份");
				}
			}
		}
		
		
	}
}
