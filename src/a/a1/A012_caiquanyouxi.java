package a.a1;

import java.util.Scanner;

public class A012_caiquanyouxi {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			System.out.println("=====来玩猜拳游戏吧=====");
			System.out.println("1，是剪刀 2，是石头 3，是布");
			String Game1 = scanner.next();
			int  Game = 0;
			try{
				Game = Integer.parseInt(Game1);
				if(Game < 1 || Game >3){
					System.out.println("请不要输入其他符号");
				}
			}catch (Exception e){
				System.out.println("你输入的不是数字");
				return;
			}
			switch(Game){
			case 1:
				System.out.println("你出的是剪刀");
				break;
			case 2:
				System.out.println("你出的是石头");
				break;
			case 3:
				System.out.println("你出的是布");
				break;
			}
				
			int cup = (int)(Math.random()*3)+1;
			
			if(Game == 1&& cup ==1){
				System.out.println("我出的是剪刀");
				System.out.println("我们平局");
			}else if(Game == 1&& cup ==2){
				System.out.println("我出的是石头");
				System.out.println("我赢了");
			}else if(Game == 1&& cup ==3){
				System.out.println("我出的是布");
				System.out.println("你赢了");
			}else if(Game == 2&& cup ==1){
				System.out.println("我出的是剪刀");
				System.out.println("你赢了");
			}else if(Game == 2&& cup ==2){
				System.out.println("我出的是石头");
				System.out.println("我们平局");
			}else if(Game == 2&& cup ==3){
				System.out.println("我出的是布");
				System.out.println("我赢了");
			}else if(Game == 3&& cup ==1){
				System.out.println("我出的是剪刀");
				System.out.println("我赢了");
			}else if(Game == 3&& cup ==2){
				System.out.println("我出的是石头");
				System.out.println("你赢了");
			}else if(Game == 3&& cup ==3){
				System.out.println("我出的是布");
				System.out.println("我们平局");
			}
			return;
	}
}
