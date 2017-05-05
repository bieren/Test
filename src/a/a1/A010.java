package a.a1;

public class A010 {
	public  void A0101(A007_nimingneibulei a){
		a.a();
		
	}
	
	public static void main(String[] args) {
		A010 t = new A010();
		t.A0101(new A007());
		
		
		t.A0101(new A007_nimingneibulei() {
			
			@Override
			public void a() {
				// TODO Auto-generated method stub
				System.out.println("匿名内部类，");
			}
		});
	}

}
