package a;

import java.util.Scanner;

public class Llm03{
	public String a = "asdasdasdasd";
	public String c = "asdasdasdasdasdacassdfvfc";
	private String b = "2asdasdasdasdasd";
	public static void main(String[] args){
		System.out.println("hello world");
		Scanner input =new Scanner(System.in);
		int aa = input.nextInt();
		String m = input.next();
		int bb = input.nextInt();
		
		System.out.println(aa);
		System.out.println(m);
		System.out.println(bb);
		
		
		
		if("+".equals(m)){
			System.out.println(aa+bb);
		}else if("-".equals(m)){
			System.out.println(aa-bb);
		}else if("*".equals(m)){
			System.out.println(aa*bb);
		}else if("/".equals(m)){
			System.out.println(aa/bb);
		}else if("%".equals(m)){
			System.out.println(aa%bb);
		}else{
			System.out.println("吔屎啦你");
		}
		input.close();
	}
}