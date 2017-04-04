package b;

import java.util.Scanner;

import a.Llm01; 

public class Bb001 {
	//全局变量 在类范围中的声明的变量
	public String a1 = "我是全局变量，是字符串变量，public标志着我是公共的可跨包的，我所在的类是b.Bb001";
	
	private String a2 = "我是全局变量，是字符串变量，private标志着我是私有的不可跨包的仅供类内调用的，我所在的类b.Bb001";
	
	private boolean c = true ;
	
	//权限为可跨包调用的方法，void标志着这个方法的没有返回值
}
