package a.a1;

import java.util.Scanner;

public class A012 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("=====来玩猜拳游戏吧=====");
		System.out.println("1，是剪刀 2，是石头 3，是布");
		String Game1 = scanner.next();

		int Game = 0;

		try {
			Game = Integer.parseInt(Game1);
			if (Game < 1 || Game > 3) {
				System.out.println("请不要输入其他数字");
				return;
			}

		} catch (Exception e) {
			System.out.println("请不要输入其他东西");
			return;
		}
		int cup = (int) (Math.random() * 3) + 1;
		if (cup == 1) {
			System.out.println("我出剪刀");
		} else if (cup == 2) {
			System.out.println("我出石头");
		} else if (cup == 3) {
			System.out.println("我出布");
		}
		if ((Game - cup) == 0) {
			System.out.println("我们平手");
		}
		if (Game > cup) {
			if ((Game - cup) == 1) {
				System.out.println("是我输了");
			} else {
				System.out.println("是我赢了");
			}
		}
		if (Game < cup) {
			if ((cup - Game) == 1) {
				System.out.println("是我赢了");
			} else {
				System.out.println("是我输了");
			}
		}
	}
}
