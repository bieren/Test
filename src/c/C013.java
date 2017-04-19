package c;

public class C013 {
	String iii = "琉珑玛";
	
	{
		String iii = "111";

		System.out.println(this.iii);
		System.out.println("通用构造块");
	}
	public C013(){
		System.out.println("构造方法一");
	}
	public C013(String iii){
		System.out.println("构造方法二");
		
	}
	public C013(int i,int j){
		System.out.println("构造方法三");
	}
	public static void main(String[] args) {
		C013 c013 = new C013();
 	    C013 c0132 = new C013("刘龙mm");
		C013 c0133 = new C013(1,2);
	}
	static {
		System.out.println("静态代码块");
	}
}
