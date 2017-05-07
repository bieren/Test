package a.a1;

public class A012_1 {

	public static void main(String[] args) {
		System.out.println("======来玩猜拳游戏吧=====");
		System.out.println("1,是剪刀,2是石头,3是布");
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		int g = 0;
		
		A012_1 a012 = new A012_1();
		
		for (int i = 0; i < 100000; i++) {
			int Game = (int) (Math.random() * 4) + 1;
			a012.order(1, Game);

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

			System.out.println("结果:" + playing);
			
			a012.result(playing);
			
			System.out.println("我赢了:" + a + "次");
			System.out.println("我们平手:" + b + "次");
			System.out.println("我输了:" + c + "次");
			System.out.println("电脑输入不合法:" + d + "次");
			System.out.println("我输入不合法:" + e + "次");
			System.out.println("出现意外错误:" + f + "次");
			System.out.println("两人犯错:" + g + "次");
			System.out.println(a+b+c+d+e+f);

			a012.proprotion(1, a, b, c);
			a012.proprotion(2, c, b, a);
		}

	}

	public void proprotion(int customer, int a, int b, int c) {
		String name = null;
		if (customer == 1) {
			name = "我";
		} else if (customer == 2) {
			name = "电脑";
		} else {
			name = "第三者";
		}
		double conut = a + b + c;
		double win = a / conut;
		double flat = b / conut;
		double transport = c / conut;
		System.out.println(name+"的胜率是:"+(double)((int)(win*1000))/10+"%");		
		System.out.println(name+"的平手率是:"+(double)((int)(flat*1000))/10+"%");
		System.out.println(name+"的败率是:"+(double)((int)(transport*1000))/10+"%");

	}

	public int[] frequency(int playing, int a, int b, int c, int d, int e, int f) {
		switch (playing) {
		case 1:
			a++;
			break;
		case 0:
			b++;
			break;
		case -1:
			c++;
			break;
		case -2:
			d++;
			break;
		case 2:
			e++;
			break;
		default:
			f++;
			break;

		}
		int[] aaa = { a, b, c, d, e, f };
		return aaa;
	}

	public void order(int customer, int order) {
		if (customer == 1) {
			System.out.println("我");
		} else if (customer == 2) {
			System.out.println("电脑");
		} else {
			System.out.println("第三者");
		}
		if (order == 1) {
			System.out.println("出剪刀");
		} else if (order == 2) {
			System.out.println("出石头");
		} else if (order == 3) {
			System.out.println("出布");
		} else {
			System.out.println(":" + order);
		}
		System.out.println();
	}

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
		System.out.println("====================");
		System.out.println();
	}

	public int playing(int game, int cup) {
		if ((game < 1 || game > 3) && (cup < 1 || cup > 3)) {
			System.out.println("两个傻逼！！");
			return 3;
		}
		if (game < 1 || game > 3) {
			return 2;
		}
		if (cup < 1 || cup > 3) {
			return -2;
		}
		if (game == cup) {
			return 0;
		} else {
			if (game > cup) {
				if (game - cup == 1) {
					return 1;
				} else {
					return -1;
				}
			} else {
				if (cup - game == 1) {
					return -1;
				} else {
					return 1;
				}
			}
		}
	}
}
