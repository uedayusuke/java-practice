package review.human;

public class Human03 {
	// 9章【クラスとメソッドを理解しよう】 復習
	// 宣言
	public String name;
	public int age;
	public String profession;

	// コンストラクタ(初期値)
	public Human03() {
		this.name = "吉田";
		this.age = 56;
		this.profession = "manga artist";
	}

	// 宣言
	public String getProfile() {
		return "年齢は" + this.age + "、職業は" + this.profession;
	}

	// 宣言
	public void greet(String friend) {
		if (friend == null) {
			System.out.println("挨拶する友達がわかりません！");
			return;
		}
		System.out.println(friend + "さん、こんにちは！");
	}

}
