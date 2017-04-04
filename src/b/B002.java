package b;

import a.Llm01;

public class B002 {
	//全局变量 在类范围中声明的变量
	public String a1 = "我是全局变量，是字符串变量，public标志着我是公共的可跨包的，我所在的类是b.B002";
	
	private boolean c = true;
	
	//权限为可跨包调用的方法，void 标志着这个方法没有返回值
	public void A01(){
		System.out.println("我是权限为可跨包调用的方法的一个动作，我所在的类是b.B002");
	}
	//权限为可跨包调用的方法，方法名前面的如果不是关键词void 比如String 必须是一个类的名字 表示这个方法会返回的变量必须会是String 类型 如果没有变量就会报错 不能编译
		public String A02(){
			System.out.println("我是权限为可跨包调用的方法的一个动作，我所在的类是b.B002");
			return "我是返回值，如果方法名前面的关键词是void，则方法中不能出现值的返回 return ‘变量’;但是可以存在没有值的返回 return;";
			
		}
		//权限为可跨包调用的方法，方法名的前面如果不是关键词void 比如 int 必须是一个类的名字 表示这个方法会返回的变量必须会是int 类型
		//如果没有变量就会报错 不能编译 可以为自己定义的类
		public int A03(){
			System.out.println("我是权限可为跨包调用的方法的一个动作，我所在的类是b.B002");
			int asdasd =  1;
			return asdasd;
		}
		
		//权限为可跨包调用的方法，方法名前面的如果不是关键词void 比如 Llm01 必须是一个类名的 表示这个方法会返回的变量必须会是Llm01类型
		//如果没有变量就会报错 不能编译 可以为自己定义的类
		public Llm01 A04(){
			a1 = "前面定义了全局变量a1，这里如果再声明一个名字叫做a1的变量，Eclipse会提示报错";
			System.out.println(this.a1 + "this.a1表示你在调用当前所在类的a1全局变量");
			return new Llm01();
			
		}
		//权限为私有的不可跨包的仅供类内调用的方法，void标志着这个方法没有返回值
		private void B(){
			System.out.println("我是权限为跨包调用的方法的一个动作，我所在的类是b.B002;方法名字前面的关键词是void，则方法中不能出现值的");
		}
}
