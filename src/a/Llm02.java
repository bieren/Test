package a;
//引用  某个类
import java.util.Scanner;

public class Llm02 {

	public String a = "5646546465";
	public String c = "abcd";
	//private 仅限在本类中调用
	private String b = "abc";
	
	
	public static void main(String[] args){
		//键盘输入 
		//第一个为整数
		//第二个为*乘+加-减/除%余 
		//第三个为整数 
		Scanner input = new Scanner(System.in);
//		System.in
//变量赋值
        int a = input.nextInt();
        String m = input.next();
        int b = input.nextInt();
        
        //输出
        System.out.println(a);
        System.out.println(m);
        System.out.println(b);
        
        //条件判断语句
        //"+".equals(m)返回Boolean类型 变量值为true(是) 或 false(否)
        if("+".equals(m)){
    		System.out.println(a+b);
        }else if("-".equals(m)){
    		System.out.println(a-b);
        }else if("*".equals(m)){
    		System.out.println(a*b);
        }else if("/".equals(m)){
    		System.out.println(a/b);
        }else if("%".equals(m)){
    		System.out.println(a%b);
        }else {
        	System.out.println("你的运算符号写错了。");
		}
        
        
        
        
        
        
        
        
        
        
//		int a = 1;
//		int b = 2;
//		float c = 10.2f; 
		//*乘
		//+加
		//-减
		// /除
		//%余   13%10=3   13%6=1
		
		
//		System.out.println(a+b);
		
		input.close();
		
	}
	
	
	public String getA(){
		
		
		
		return ("123"+"123");
	}
	
	
	
}
