package c;

public class C002 {
	void speak(String name,int age){
		System.out.println("我叫"+name+"，我今年"+age+"岁了");
	}
	public static void main(String[] args) {
		C002 zhangsan = new C002();
		zhangsan.speak("张三",23);
	}
}
