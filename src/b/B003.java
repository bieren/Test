package b;

import java.util.Scanner;

import a.Llm01;

public class B003 {
	
	//全局变量 在类范围中声明的变量
	public String a1 = "我是全局变量，是字符串变量，prblic标志着我是公共的可跨包的，我所在的类是b.B003";
	
	private String a2 = "我是全局变量，是字符串变量，private标志着我是私有的不可跨包的仅供类内调用，我所在的类是b.B003";
	
	private boolean c = true;
	
	//权限为可跨包调用的方法，void标志着这个方法没有返回值
	public void A01(){
		System.out.println("我是权限为可跨包调用的方法的一个动作，我所在的类是b.B003");
	}
	//权限为可跨包调用的方法，方法名前面的如果不是关键词void 比如 String 必须是一个类的名字表示这个方法会返回的变量必须会是String
	//类型 如果没有变量就会报错 不能编译
	public String A02(){
		System.out.println("我是权限为可跨包调用的方法的一个动作，我所在的类是b.B003");
		return "我是返回值，如果方法名前面的关键词是void，则方法中不能出现值的返回 return ‘变量’;但可以存在没有值的返回 return：";
	}
	//权限为可跨包调用的，方法名前面的如果不是关键词void 比如 int 必须是一个类的名字表示这个方法会返回的变量必须会是 int 类型
	//如果没有变量就会报错 不能编译 可以为自己定义的类
	public int A03(){
		System.out.println("我是权限为可跨包调用的方法的一个动作，我所在的类是b.B003");
		int asdasd = 1;
		return asdasd;
	}
	
	//权限为可跨包调用的方法，方法名前面的如果不是关键词void 比如 Llm01 必须是一个类的名字 表示这个方法会返回的变量必须会是Llm01类型
	//如果没有变量就会报错 不能编译 可以为自己定义的类
	public Llm01 A04(){
		a1 = "前面定义了全局变量a1.这里如果再声明一个名字叫做a1的变量，Eclipse会提示报错";
		
		System.out.println(this.a1 + "  this.a1表示你在调用当前所在类的a1全局变量");
		//int asdasd = 1;
		return new Llm01();
	}
	
	//权限为私有的不可跨包的仅供类内调用的方法，void标志着这个方法没有返回值
	private void B(){
		System.out.println("我是权限为可跨包调用的方法的一个动作，我所在的类是b.B003;方法名前面的关键词是void，则方法中不能出现值的返回 return ‘变量’;但可以存在没有值的返回 return");
		return;
	}
	
	public static void main(String[] args) {
		B003 b001 = new B003();
		
		/**
		 * while (条件)（被循环执行的代码）
		 */
		
		// 根据括号里的条件来决定是否循环执行代码
		while(b001.c) {
			b001 = b001.C(b001);
			if(!b001.c){
				System.out.println("再见！");
				return;
			}
		}
	}
	
	public B003 C(B003 b001){
		
		System.out.println("输入指令1.调用全局公共变量a1");
		System.out.println("输入指令2，调用全局私有变量a2");
		System.out.println("输入指令3，调用公共无返回方法A01()");
		System.out.println("输入指令4，调用公共返回String字符串类型方法A02()");
		System.out.println("输入指令5，调用公共返回int整数类型方法A03()");
		System.out.println("输入指令6.调用公共返回Llm01复杂类型方法A04()");
		System.out.println("输入指令7，调用私有无返回方法B()");
		System.out.println("输入指令88，退出");
		
		Scanner scanner = new Scanner (System.in);
		
		int nextInt = scanner.nextInt();
		
		if (nextInt == 1){
			System.out.println(this.a1);
		}
		if(nextInt == 2){
			System.out.println(this.a2);
		}
		if(nextInt == 3){
			this.A01();
		}
		if(nextInt == 4){
			System.out.println(this.A02());
		}
		if(nextInt == 5){
			System.out.println(this.A03());
		}
		if(nextInt == 6){
			System.out.println(this.A04());
		}
		if(nextInt == 7){
			this.B();
		}
		if(nextInt == 8){
			b001.c = false;
			return b001;
		}
		System.out.print("请输入指令：");
		return b001;
	}
}
