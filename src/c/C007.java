package c;

public class C007 {
	int Llm(int a,int b){
		System.out.print("方法一的结果是: ");
		return a+b;
	}
	int Llm(int a,int b,int c){
		System.out.print("\n方法一的结果是：  ");
		return a+b+c;
	}
	public static void main(String[] args) {
		/**
		 * 1、第22行 new C007()     类 的新
		 * 2、第22行abb = new C007()   类 的新  对象
		 * 3、第23行abb.Llm(1,2)      对象调用 的方法的 参数
		 * 4、第5行System.out.print("方法一的结果是: ")    打印
		 * 5、第6行return a+b      返回 方法执行的结果
		 * 6、第22行System.out.println(abb.Llm(1,2)) 打印方法返回的结果
		 * 7、同理执行第24行重复第3456点操作
		 */
//		C007 abb = new C007();
//		System.out.println(abb.Llm(1,2));
//		System.out.println(abb.Llm(1,2,3));
		
		
		
		C007 abb = new C007();
		int a1 = abb.Llm(1,2);
		System.out.println(a1);
		int a2 = abb.Llm(1,2,3);
		System.out.println(a2);
		
		
		
		
		
	}

}
