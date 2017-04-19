package c;

public class C009 {
	public static void main(String[] args) {
		int []arr = new int[20];
		arr[1]=1;
		arr[2]=1;
		System.out.print(" "+arr[1]);
		System.out.print(" "+arr[2]);
		for(int a = 3;a<20;a++){
			arr[a]=arr[a-1]+arr[a-2];
			System.out.print("  "+arr[a]);
		}
	}
}
