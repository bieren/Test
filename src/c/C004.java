package c;
class SanWei{
	int x ;
	int y ;
	int t ;
}

public class C004 {
	void speak(int age,SanWei sanWei){
		System.out.println("我今年"+age+"岁了,我的三围是"+sanWei.x+","+sanWei.y+",+"+sanWei.t);
		age=24;
	}
	public static void main(String[] args) {
		C004 xiaoli = new C004();
		int age = 23;
		SanWei sanWei = new SanWei();
		sanWei.x = 90;
		sanWei.y = 60;
		sanWei.t = 90;
		xiaoli.speak(age,sanWei);
		System.out.println(age);
	}

}
