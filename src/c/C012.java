package c;

public class C012 {
	public C012(){
		System.out.println("构造块");
	}
	
	public C012(String a,int b){
		System.out.println(a+","+b);
	}
	
	public C012(int c,int d){
		System.out.println("分别是"+c+"和"+d);

	}
	public static void main(String[] args) {
		new C012();
		new C012("打印次数",88);
		new C012(88,99);
	}
}
