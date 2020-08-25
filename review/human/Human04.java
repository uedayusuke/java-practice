package review.human;

public class Human04 {
	// 9章【クラスとメソッドを理解しよう】 復習
	// 宣言

	// static変数
	static public int humanCount = 0;
	public String name;

	public static final String GREETING = "こんにちは！";

	public Human04(String name) {
		this.name = name;
		// インスタンスが作られる毎にインクリメントする
		Human04.humanCount++;
	}

	static public void staticMethodPrint() {
		// staticメソッドはインスタンス変数を使えない
		// →nameは使えない
		System.out.println("人の数は" + Human04.humanCount);
	}

	public void instanceMethodPrint() {
		System.out.println("名前は" + name);
		System.out.println("人の数は" + Human04.humanCount);
	}

}
