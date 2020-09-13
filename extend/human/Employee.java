package extend.human;

/*
継承の基本構文
修飾子 class クラス名 extends スーパークラス名 {
	サブクラスの処理
}
→継承できるクラスは1つ/final修飾子は継承できない
 */
public class Employee extends Human {
	// 13章【継承を理解しよう】
	private String department;

	// コンストラクタ
	public Employee(String name, int age, String department) {
		// 最初にスーパークラスのコンストラクタを呼び出す
		super(name, age);
		this.department = department;
	}

	// メソッド
	public String getEmployeeProfile() {
		String profile = "年齢は" + super.age + "です。";
		profile += "サラリーマンで、部署は" + this.department + "です。";
		return profile;
	}
}
