package extend.human;

public class Employee extends Human {
	// 13章【継承を理解しよう】
	private String department;

	// コンストラクタ
	public Employee(String name, int age, String department) {
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
