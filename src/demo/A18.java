package demo;

public class A18 {
	public static void main(String[] args) {
		int a = 4165;
		int b = 4684;
		int c = 4654;
		
		int aa = 0;
		int bb = 0;
		if (a>b){
			aa = a;
		}else{
			aa = b;
		}
		if (aa>c){
			bb = aa;
		}else{
			bb = c ;
		}
		System.out.println("最大的是"+" ："+bb);
		
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
