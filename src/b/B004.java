package b;

import java.util.Scanner;

import a.Llm01;

public class B004 {
	
	public String a1 = "我是全局变量，是字符串变量，public标志着我是公共的可跨包的，我所在的类是b.B004";
	
	private String a2 = "我是全局变量，是字符串变量，private表记者我是私有的不可跨包的仅供类内调用的，我所在的类是b.B004";
	
	private boolean c =true;
	
	public void A01(){
		System.out.println("我是权限为可跨包调用的放大一个动作，我所在的类是b.B004");
	}
	
	public String A02(){
		System.out.println("我是权限为可跨包调用的方法的一个动作，我所在的类是b.B004");
		return "我是返回值，如果方法名前面的关键词是void，则方法中不能出现值的返回 return ‘变量’;但可以存在没有值的返回 return;";
	}
	
	public int A03(){
		System.out.println("我是权限为可跨包调用的方法的一个动作，我所在的类是b.B004");
		int asdasd = 1;
		return asdasd;
	}
	
	public Llm01 A04(){
		a1 = "前面定义了全局变量a1，这里如果再声明一个名字叫做a1的变量，Eclipse会提示报错";
		System.out.println(this.a1 + "  this.a1表示你在调用当前所在类的a1全局变量");
		return new Llm01();
	}
	
	private void B(){
		System.out.println("我是权限为可跨包调用的方法的一个动作，我所在的类是b.B004;方法名前面的关键词是void，则方法中不能出现值的返回 return ‘变量’;但可以存在没有值的返回return;");
		return;
	}
	
	public static void main(String[] args){
		B004 b001 = new B004();
		System.out.println("输入指令1，调用全局私有变量a1");
		System.out.println("输入指令2，调用全局私有变量a2");
		System.out.println("输入指令3，调用公共无返回方法A01()");
		System.out.println("输入指令4，调用公共返回String字符串类型A02()");
		System.out.println("输入指令5，调用公共返回int证书类型方法A03()");
		System.out.println("输入指令6，调用公共返回Llm01复杂类型方法A04()");
		System.out.println("输入指令7，调用个私有无返回方法B()");
		System.out.println("输入指令88，退出");
		
		while (b001.c){
			b001 = b001.C(b001);
			if (!b001.c){
				System.out.println("再见！");
			}
		}
	}
	
	public B004 C(B004 b001){

		
		Scanner scanner = new Scanner(System.in);
		
		int nextInt = scanner.nextInt();
		
		if(nextInt == 1){
			System.out.println(this.a1);
		}else if(nextInt == 2){
			System.out.println(this.a2);
		}else if(nextInt == 3){
			this.A01();
		}else if(nextInt == 4){
			System.out.println(this.A02());
		}else if(nextInt == 5){
			System.out.println(this.A03());
		}else if(nextInt == 6){
			System.out.println(this.A04());
		}else if(nextInt == 7){
			this.B();
		}else if(nextInt == 88){
			b001.c =false;
			return b001;
		}else {
			System.out.println("不在选项当中");
			}
		
		System.out.println("请输入指令；");
		return b001;
	}

}
