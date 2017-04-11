package demo;

public class A14_maxNumber {
	public static void main(String[] args) {
		int a = 6134;
		int b = 6184;
		int c = 6157;
		
//		int aa = a>b?a:b;
//		
//		int bb = aa>c?aa:c;
//		
//		System.out.println(bb);
		
		int aa = 0;
		int bb = 0;
		
		if (a>b) {
			aa=a;
		}else {
			aa = b;
		}

		if (aa>c) {
			bb=aa;
		}else {
			bb = c;
		}
		
		System.out.println(bb);
		
		
		
		if(a<b){
			aa=a;
		}else {
			aa = b;
		}
		if(aa<c){
			bb = aa;
		}else {
			bb = c ;
		}
		System.out.println(bb);		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
