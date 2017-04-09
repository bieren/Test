package demo;

public class A04 {
	public static void main(String[] args) {
		//三目运算符
		
		String a = 2>3?"表达式为成立":"表达式为不成立";
		boolean b = "表达式为成立".equals(a)?true:false;
		String c= b==true?"表达式为成立":"表达式为不成立";
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
}
