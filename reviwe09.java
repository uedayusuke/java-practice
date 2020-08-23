
public class reviwe09 {
	// 9章【クラスとメソッドを理解しよう】 復習
	// クラス
	public static void main(String[] args) {
		// 初期値のインスタンスを生成
		human01 yamada = new human01();
		// 初期値のフィールドを出力
		System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です");

		// 引数ありのインスタンスを生成
		human01 zone = new human01("ゾーン", 39);
		// 引数が代入されたフィールドを出力
		System.out.println("名前は" + zone.name + "で、年齢は" + zone.age + "です");
	}
}
