package demo;

public class A06 {
	public static void main(String[] args) {
		int a = 1;
		
		while(a<10){
			if(a%3==0){
				System.out.print("	");
			}
			if(a%3==1){
				System.out.print("		");
			}
			if(a%3==2){
				System.out.print("			");
			}
			System.out.print(a+"\n");
			a++;
		}
	}

}
