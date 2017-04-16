package c;

import java.util.Scanner;

public class C001 {

	public static void main(String[] args) {
		
		Human human = new Human();
		human.setId(1);
		human.setName("琉珑玛");
		human.setAge(23);
		human.setHight(167);
		human.setPower(10);
		human.setLevel(0);
		human.setHp(100);
		
		System.out.println("我的角色是"+human.toString());
		
//		==========================================================
		
		Human child = new Human(2, "八神太一", 12, 140, 20, 40,100);
		
		System.out.println("我的对手是"+child);

		System.out.println("请选择指令！");
		System.out.println("1、攻击敌人");
		System.out.println("2、被敌人攻击");
		System.out.println("3、你和对手都无所事事");
		
		while(true){
			C001 c001 = new C001();
			c001.doSome(human, child);
			if (human.getHp()<=0) {
				System.out.println(human.getName()+"已死亡");
				return;
			}
			if (child.getHp()<=0) {
				System.out.println(child.getName()+"已死亡");
				return;
			}
		}
		
	}
	
	private void doSome(Human human,Human child){
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		if (a==1) {
			
			child.setHp(child.getHp()-human.getPower());
			System.out.println("我的对手的HP减少："+human.getPower());
			System.out.println("我的对手的详细信息："+child);
			
		}else if (a==2) {
			
			human.setHp(human.getHp()-child.getPower());
			System.out.println("我的HP减少："+child.getPower());
			System.out.println("我的对手的详细信息："+human);
			
		}else{

			System.out.println(human.getName()+"在扣鼻屎");

			System.out.println(child.getName()+"在旁边偷偷的放屁");
			
		}
		
		
		}
	
}
