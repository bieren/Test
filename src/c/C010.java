package c;

public class C010 {
	public static int f(int a) {
		if(a==0){
			System.out.print("参数错误!");
		}
		// a ==1  a 是否等于1
		// ||或者 
		// 三目运算符           结果=(条件语句)?结果1：结果2
	     return (a == 1|| a ==2)?1: f(a-1)+f(a-2);
	     // 或者
//		if(a == 1|| a ==2){
//			return 1;
//		}else{
//			return f(a-1)+f(a-2);
//		}
	}
	
	public static void main(String[] args){
		for (int i =1;i<20;i++){
			System.out.println(f(i)+" ");
		}
	}
}
