package extend.phone;

//13章【継承を理解しよう】

/*
インターフェースの基本構文
[public] interface インターフェース名 extends インターフェース名, インターフェース名 {
	↓フィールドの宣言(定数)
	(public static final) 定数の型 定数名 = 初期値;
	↓メソッドの宣言(抽象メソッド)
	(public abstract) 戻り値の型 メソッド名(引数);
 	}
 */

public interface Camera {
	// 13章【継承を理解しよう】

	public void takePicture();
}
