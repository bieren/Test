package demo;

public class A07 {
	public static void main(String[] args) {
		int n = 100;
		String m = n + "×" + n + "=" + n * n;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				String a = i + "×" + j + "=" + i * j;
				System.out.print(a);
				if (i == j) {
					System.out.println();
					break;
				}
				for (int b = m.length() - a.length(); b > 0; b--) {
					System.out.print(" ");
				}
				System.out.print("  ");
			}
		}
	}
}
