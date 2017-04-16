package demo;

public class A19 {
	public static void main(String[] args) {
		int a = 7643;
		int b = 8434;
		int c = 6786;
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
		System.out.println("最大的是 ："+bb);
		
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
		System.out.println("最小的是 ："+bb);
	}

}
