package reviwe;

public class human01 {
	// 9章【クラスとメソッドを理解しよう】 復習
	// 宣言
	public String name;
	public int age;

	// 初期値（デフォルト）
	public human01() {
		name = "山田";
		age = 25;
	}
	// 引数あり
	public human01(String name, int age) {
		this.name = name;
		this.age =age;
	}
}
