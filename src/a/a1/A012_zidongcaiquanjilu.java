package a.a1;

import java.util.Scanner;

public class A012_zidongcaiquanjilu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("=====来玩猜拳游戏吧=====");
		System.out.println("1，是剪刀 2，是石头 3，是布");
//		String Game1 = scanner.next();
//
//		int Game = 0;
//
//		try {
//			Game = Integer.parseInt(Game1);
//			if (Game < 1 || Game > 3) {
//				System.out.println("请不要输入其他数字");
//				return;
//			}
//
//		} catch (Exception e) {
//			System.out.println("请不要输入其他东西");
//			return;
//		}
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		int g = 0;
		A012_zidongcaiquanjilu a012 = new A012_zidongcaiquanjilu();
		
		for (int i = 0; i < 1000; i++) {

			int Game = (int) (Math.random() * 4) + 1;

			a012.order(1, Game);

			// double random = Math.random();
			// System.out.println(random);
			int cup = (int) (Math.random() * 4) + 1;

			a012.order(2, cup);

			int playing = a012.playing(Game, cup);
			if (playing == 3) {
				g++;
			}
			
			int[] frequency = a012.frequency(playing, a, b, c, d, e, f);

			a = frequency[0];
			b = frequency[1];
			c = frequency[2];
			d = frequency[3];
			e = frequency[4];
			f = frequency[5];
			
			System.out.println("结果：" + playing);

			a012.result(playing);
		}
		System.out.println("我赢了：" + a + "次");
		System.out.println("平手：" + b + "次");
		System.out.println("我输了：" + c + "次");
		System.out.println("电脑输入不合法：" + d + "次");
		System.out.println("我输入不合法：" + e + "次");
		System.out.println("出现意外错误：" + f + "次");
		System.out.println("两人犯傻：" + g + "次");
		System.out.println(a + b + c + d + e + f);
		

		 a012.proportion(1, a, b,c);
		 a012.proportion(2, c, b,a);
		
		
		
		
		
	}
	
	/**
	 * 哪个人
	 * 胜率
	 * 平手率
	 * 败率
	 * 
	 */
	/**
	 * 
	 * @param customer 1 为我   2 为电脑 3 为第三者
	 * @param a 胜的次数
	 * @param b 平手次数
	 * @param c 输的次数
	 */
	public void proportion(int customer, int a, int b, int c) {
		 String name = null;
		 
		if (customer == 1) {
//			System.out.print("我");
			name = "我";
		} else if (customer == 2) {
//			System.out.print("电脑");
			name = "电脑";
		} else {
//			System.out.print("第三者");
			name = "第三者";
		}
		
		double count  = a + b + c;
		double win = a / count;
		double flat = b / count;
		double transport = c / count;
		System.out.println(name+"的胜率是:"+(double)((int)(win*1000))/10+"%");		
		System.out.println(name+"的平手率是:"+(double)((int)(flat*1000))/10+"%");
		System.out.println(name+"的败率是:"+(double)((int)(transport*1000))/10+"%");

		// TODO Auto-generated method stub

	}

	/**
	 * 次数合集
	 * @param playing 结果命令
	 * @param a 赢的次数
	 * @param b	平手次数
	 * @param c 输的次数
	 * @param d 电脑不合法次数
	 * @param e 我的不合法次数
	 * @param f 出现意外错误的次数
	 * @return
	 */
	public int[] frequency(int playing, int a, int b, int c, int d, int e, int f) {
		switch (playing) {
		case 1:
			// System.out.println("我赢了");
			a++;
			break;

		case 0:
			b++;
			// System.out.println("平手");
			break;

		case -1:
			c++;
			// System.out.println("电脑赢了");
			break;
		case -2:
			d++;
			// System.out.println("电脑输入不合法");
			break;

		case 2:
			e++;
			// System.out.println("我输入不合法");
			break;

		default:
			f++;
			// System.out.println("出现意外错误！");
			break;
		}
//		System.out.println();
//		System.out.println("============================");
		
		int[] aaa = {a,b,c,d,e,f};
		return aaa;

	}

	/**
	 * 命令解读
	 * 
	 * @param customer
	 *            用户
	 * @param order
	 *            指令
	 */
	public void order(int customer, int order) {

		if (customer == 1) {
			System.out.print("我");
		} else if (customer == 2) {
			System.out.print("电脑");
		} else {
			System.out.print("第三者");
		}

		if (order == 1) {
			System.out.print("出剪刀");
		} else if (order == 2) {
			System.out.print("出石头");
		} else if (order == 3) {
			System.out.print("出布");
		} else {

			System.out.print(":"+order);
		}
		System.out.println();
	}

	/**
	 * 指令解读
	 * 
	 * @param playing
	 *            playing方法的返回值
	 */
	public void result(int playing) {
		switch (playing) {
		case 1:
			System.out.println("我赢了");
			break;

		case 0:

			System.out.println("平手");
			break;

		case -1:

			System.out.println("电脑赢了");
			break;
		case -2:

			System.out.println("电脑输入不合法");
			break;

		case 2:

			System.out.println("我输入不合法");
			break;

		default:
			System.out.println("出现意外错误！");
			break;
		}
		System.out.println();
		System.out.println("============================");
		System.out.println();

	}

	/**
	 * game == cup 平手 game > cup && game - cup == 1 game赢 game < cup && cup -
	 * game == 1 cup赢
	 * 
	 * 1赢 0平手 -1输 2我输入不合法 -2你输入不合法
	 * 
	 * @param game
	 * @param cup
	 * @return
	 */
	public int playing(int game, int cup) {

		if ((game < 1 || game > 3)&&(cup < 1 || cup > 3)) {
			System.out.println("两个傻逼！！");
			return 3;
		}
		
		if (game < 1 || game > 3) {
			// System.out.println(2);
			return 2;
		}
		if (cup < 1 || cup > 3) {
			// System.out.println(2);
			return -2;
		}

		if (game == cup) {
			// System.out.println("平手");
			return 0;
		} else {
			if (game > cup) {
				if (game - cup == 1) {
					// System.out.println("我赢了");
					return 1;
				} else {
					// System.out.println("我输了");
					return -1;
				}
			} else {
				if (cup - game == 1) {
					// System.out.println("我输了");
					return -1;
				} else {
					// System.out.println("我赢了");
					return 1;
				}
			}
		}
	}

	public static void main1(String[] args) {
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
		System.out.println(cup);
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
