package capsule.human;

public class HumanCapsule {
	// 12章【カプセル化を理解しよう】

	// privateをアクセス修飾子に設定し外部から隠蔽
	// →変更を禁止できるが値の取得もできなくなる
	// →"getter"、"setter"を作成し他のプログラムから参照できるようにする
	private String name;
	private int age;

	public HumanCapsule(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}
}
