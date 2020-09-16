package practice13;

import extend.phone.Phone;

// 13章確認問題

// PhoneインターフェースとFlyingインターフェースを実装
public class FlyingPhone implements Phone, Flying {
	// プログラム作成

	// minutesを宣言
	private int minutes;

	// コンストラクタ
	public FlyingPhone(int minutes) {
		this.minutes = minutes;
	}

	// flyメソッド
	public void fly() {
		System.out.println(minutes +"分間飛びます。");
	}
}
