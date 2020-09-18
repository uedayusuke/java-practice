package polymorphism.human;

//14章【ポリモーフィズムを理解しよう】

// Humanクラスを継承
public class Employee extends Human {
	private String department;

	public Employee(String name, int age, String department) {
		// スーパークラス(Humanクラス)を呼び出す
		super(name, age);
		this.department = department;
	}

	// オーバーライドし、Employeeクラスに変更
	public String getProfile() {
		String profile = "年齢は" + this.age + "です。";
		profile += "サラリーマンで、部署は" + this.department + "です。";
		return profile;
	}
}
