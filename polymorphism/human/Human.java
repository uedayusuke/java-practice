package polymorphism.human;

// 14章【ポリモーフィズムを理解しよう】
public class Human {
	// 宣言
	private String name;
	protected int age;

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// final修飾子が設定されたのでオーバーライド禁止
	final public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public String getProfile() {
		return "名前は" + this.name + "、年齢は" + this.age + "です。";
	}
}
