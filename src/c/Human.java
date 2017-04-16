package c;

public class Human {

	/**
	 * id
	 * Integer
	 */
	private Integer id ;
	
	/**
	 * 名字
	 * String
	 */
	private String name ;
	
	/**
	 * 年龄
	 * int
	 */
	private int age ;

	/**
	 * 身高（cm）
	 * double
	 */
	private double hight;

	/**
	 * 等级
	 * int
	 */
	private int level;

	/**
	 * 力量
	 * int
	 */
	private int power;

	/**
	 * 血量
	 * int
	 */
	private int hp;
	
	
	public Human() {

	}

	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}


	@Override
	public String toString() {
		return "Human [id=" + id + ", name=" + name + ", age=" + age + ", hight=" + hight + ", level=" + level
				+ ", power=" + power + ", hp=" + hp + "]";
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHight() {
		return hight;
	}

	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public Human(Integer id, String name, int age, double hight, int level, int power, int hp) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.hight = hight;
		this.level = level;
		this.power = power;
		this.hp = hp;
	}


	public void setHight(double hight) {
		this.hight = hight;
	}
	
	
}
