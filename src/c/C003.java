package c;

import sun.applet.Main;

public class C003 {
	int speak(String name,int age,String ...hobbise){
		System.out.println("我叫"+name+"，我今年"+age+"岁了");
		System.out.print("我的爱好： ");
		for(String hobby:hobbise){
			System.out.print(hobby+" ");
		}
		int totalhobbies = hobbise.length;
		return totalhobbies;
	}
	public static void main(String[] args) {
		C003 zhangsan = new C003();
		int n = zhangsan.speak("张三",23,"游泳","唱歌","跳舞");
		System.out.println("\n有"+n+"个爱好");
	}
}
