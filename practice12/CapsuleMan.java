package practice12;

public class CapsuleMan {
	// 12章 確認問題 カプセル化
	private String name;
	private int age;

	public CapsuleMan(String name, int age) {
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

	// ageのsetterメソッド
	public void setAge(int age) {
		this.age = age;
	}
}
