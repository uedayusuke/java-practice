package extend.human;

public class Human {
	// 13章【継承を理解しよう】
	// privateは本クラスからのみアクセス可能
	private String name;
	// protectedはサブクラスからも可能
	protected int age;

	// コンストラクタ
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// nameのgetterメソッド
	public String getName() {
		return this.name;
	}

	// ageのgetterメソッド
	public int getAge() {
		return this.age;
	}
}
