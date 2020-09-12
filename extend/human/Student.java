package extend.human;

public class Student extends Human {
	// 13章【継承を理解しよう】
	private int score;

	// コンストラクタ
	public Student(String name, int age, int score) {
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
