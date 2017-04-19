package c;

public class C008 {
	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		int c = 0;
		System.out.println(a);
		System.out.println(b);
		for(int e = 1;e < 10; e++){
			c = a + b;
			a = b;
			b = c;
			System.out.println(c);
		}
	}

}
