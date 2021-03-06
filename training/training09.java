// パッケージがtrainingと宣言
package training;
// training.human.Human01~03をインポート
import training.human.Human01;
import training.human.Human02;
import training.human.Human03;

public class training09 {
	public static void main(String[] args) {
		// 9章【クラスとメソッドを理解しよう】
		// クラス
		Human01 yamada = new Human01();
		System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");

		Human01 sato = new Human01("佐藤", 25);
		System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");

		// メソッド
		Human02 tanaka = new Human02();

		System.out.println("私の名前は、" + tanaka.name + "です。");
		String profile = tanaka.getProfile();
		System.out.println(profile + "です。");

		tanaka.greet("田邊");
		tanaka.greet(null);

		// 修飾子
		Human03 satou = new Human03("佐藤");
		Human03 kagami = new Human03("鏡");

		Human03.staticMethodPrint();
		System.out.println();

		System.out.println(Human03.GREETING);

		satou.instanceMethodPrint();
		System.out.println();

		kagami.instanceMethodPrint();
		System.out.println();

	}
}
