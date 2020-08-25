package review;

import review.human.Human02;
import review.human.Human03;
import review.human.human01;

public class reviwe09 {
	// 9章【クラスとメソッドを理解しよう】 復習
	// クラス
	public static void main(String[] args) {
		// Human01コンストラクタ（初期値）をyamadaに代入
		human01 yamada = new human01();
		// 初期値のフィールドを出力
		System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です");

		// 引数ありのインスタンスを生成
		human01 zone = new human01("ゾーン", 39);
		// 引数が代入されたフィールドを出力
		System.out.println("名前は" + zone.name + "で、年齢は" + zone.age + "です");

	// パッケージ
		// Human02コンストラクタをtsugeに代入
		Human02 tsuge = new Human02();
		System.out.println("名前は" + tsuge.name + "で、年齢は" + tsuge.age + "です。");

	// メソッド
		// Human03コンストラクタ（初期値）をyoshidaに代入
		Human03 yoshida = new Human03();
		System.out.println("私の名前は" + yoshida.name + "です。");

		String profile = yoshida.getProfile();
		System.out.println(profile + "です。");

		yoshida.greet("高橋");
		yoshida.greet(null);

		Human03 ikeziri = new Human03("池尻", 36, "フリーター");
		System.out.println("私の名前は、" + ikeziri.name + "です。");
		profile = ikeziri.getProfile();
		System.out.println(profile + "です。");
		ikeziri.greet("葵");
		ikeziri.greet(null);
	}
}
