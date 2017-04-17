package c;

class SanWei1{
	int xw ;
	int yw ;
	int tw ;
}

/**
 * 面向对象 之 名字 三围 练习
 * @author Administrator
 *
 */
public class C005 {
	//对象名 可以理解为 变量名
	void a(String name,int age,SanWei1 sanwei){
		System.out.println("我叫"+name+"\n我今年"+age+"岁了"+"\n我的三围分别是 :"+sanwei.xw+"，"+sanwei.yw+"，"+sanwei.tw);
	}
	public static void main(String[] args) {
		C005 abc = new C005();
		
		String  aabb = "张三";
		
		int ccc = 23;
		int xw = 90;
		int yw = 60;
		int tw = 90;
		
		SanWei1 abcc = new SanWei1(); 
		abcc.xw = xw;
		abcc.yw = yw;
		abcc.tw = tw;
		
		abc.a(aabb, ccc, abcc);
		
		
		
	}
}
