package demo;

public class A15zuixiao {
	public static void main(String[] args) { 
		int a = 1;
		int b = 2;
		int c = 3;
		
		int aa = 0;
		int bb = 0;
		if(a>b){
			aa = a;
		}else{
			aa = b;
		}
		if(aa>c){
			bb = aa;
		}else{
			bb = c;
		}
		System.out.println(bb);
		
		if(a<b){
			aa = a;
		}else{
			aa = b;
		}
		if(aa<c){
			bb = aa;
		}else{
			bb = c;
		}
		System.out.println(bb);
	}
	
}
