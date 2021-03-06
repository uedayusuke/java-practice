package polymorphism.human;

//14章【ポリモーフィズムを理解しよう】

// Humanクラスを継承
public class Student extends Human {
	private int score;

	public Student(String name, int age, int score) {
		// スーパークラス(Humanクラス)を呼び出す
		super(name, age);
		this.score = score;
	}

	// オーバーライドし、Studentクラスに変更
	// @Override:コンパイル時にオーバーライドの条件を満たしていることを保証
	// →一つでも満たしていないとコンパイルエラー
	@Override
	public String getProfile() {
		String profile = "年齢は" + super.age + "です。";
		profile += "学生で、テストの点数は" + this.score + "点です。";
		return profile;
	}
}
