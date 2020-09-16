package practice13;

// 13章確認問題

// インターフェース
public interface Flying {
	// メソッド(抽象メソッド)
	void fly();

	// defaultメソッド
	default void powerOff() {
		System.out.println("飛んでいる場合は落下します.");
	}
}
