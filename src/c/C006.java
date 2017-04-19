package c;

class aabb{
	int shengao;
}


public class C006 {
	void llm(String name,int age,aabb shengao){
		System.out.println("我叫"+name+"\n我今年"+age+"岁了"+"\n我的身高是 ："+shengao.shengao);
	}
	public static void main(String[] args) {
		C006 llm01 = new C006();
		String name = "琉珑玛";
		int age = 23;
		
		aabb aabb = new aabb();
		aabb.shengao = 167;
		
		llm01.llm(name,age,aabb);
		
	}

}
