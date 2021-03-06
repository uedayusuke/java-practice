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

// インターフェースを宣言
public interface Phone {
	// フィールドの宣言(定数)→"public static final"は自動追加、明示する必要なし
	 final int MAX_NUMBER_DIGITS = 11;

	// メソッドの宣言(抽象)→"public abstract"が自動追加、明示する必要なし
    void call(String number);

    // defaultメソッドを宣言
    /*
     * defaultメソッドの基本構文
     	default 戻り値の型 メソッド名() {
     		// デフォルト処理
     	}
    */
    default void powerOff() {
    	System.out.println("電源を切ります。");
    }
}
