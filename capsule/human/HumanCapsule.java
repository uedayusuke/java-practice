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

	/*
	getterメソッド
	public 戻り値の型(フィールドの型) getフィールド名() {
		return this.フィールド名
	}
	 */
	// nameのsetterメソッド
	// →値の取得が可能になる
	public String getName() {
		return this.name;
	}

	/*
	setterメソッド
	public void setフィールド名(フィールドの型 引数) {
		this.フィールド名 = フィールドの型の引数;
	}
	 */
	// nameのsetterメソッド
	// →値の変更が可能になる
	public void setName(String name) {
		this.name = name;
	}

	// ageのgetterメソッド
	// 年齢は変更しないのでsetterメソッドは作らない
	public int getAge() {
		return this.age;
	}
}
