package extend.human;

/*
継承の基本構文
修飾子 class クラス名 extends スーパークラス名 {
	サブクラスの処理
}
→継承できるクラスは1つ/final修飾子は継承できない
 */
public class Student extends Human {
	// 13章【継承を理解しよう】
	private int score;

	// コンストラクタ
	public Student(String name, int age, int score) {
		// 最初にスーパークラスのコンストラクタを呼び出す
		super(name, age);
		this.score = score;
	}

	// メソッド
	public String getStudentProfile() {
		String profile = "年齢は" + super.age + "です。";
		profile += "学生で、テストの点数は" + this.score + "点です。";
		return profile;
	}
}
