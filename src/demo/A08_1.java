package demo;

public class A08_1 {
	public static void main(String[] args) {
		int f = 9;
		String e = f + "x" + f + "=" +f * f;
		for(int a = 1;a<10;a++){
			for(int b = 1;b<10;b++){
				
				String c = a + "x"+ b + "="+ a * b;
				System.out.print(c);	
				if (a == b){
					System.out.println( );
					break;
				}
				
				int length = c.length();
				int length2 = e.length();
				
				for (int d = length2 - length; d > 0; d--) {
					System.out.print(" ");
				}
				System.out.print("  ");
				}
				}
		}
	}


