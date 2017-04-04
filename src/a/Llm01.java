package a;

import java.util.Scanner;

public class Llm01 {
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "我是a.Llm01";
	}
	
	
	public static void main(String[] args){
		
		
		//本类实例化 
		
		Llm01 A01 = new Llm01();
		System.out.println(A01.toString());
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		String m = input.next();
		int b = input.nextInt();
		//输出
		System.out.println(a);
		System.out.println(m);
		System.out.println(b);
		
		if("+".equals(m)){
			System.out.println(a+b);
		}else if("-".equals(m)){
			System.out.println(a-b);
		}else if("/".equals(m)){
			System.out.println(a/b);
		}else if("*".equals(m)){
			System.out.println(a*b);
		}else if("%".equals(m)){
			System.out.println(a%b);
		}else
	        System.out.println("吔屎啦你。");

	
	
	
	
	    input.close();
	    
	}

}