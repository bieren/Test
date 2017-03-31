package a;

import java.util.Scanner;

public class Llm04 {

	public String a = "sadasdasdasdasd";
	public String c = "abcd";
	private String b = "abc";
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int aa = input .nextInt();
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
		}else {
			System.out.println("吔屎啦你");
		}
		
		
		
		
		
		input.close();
		
		
	}
			
}
