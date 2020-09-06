package exception;

import java.sql.SQLException;

public class Chapter10 {
	// 10章 確認問題
	public static void main(String[] args) {
		try {
			int array[] = {1, 3, 5};
			Chapter10.validIndex(array, 2);
			Chapter10.validIndex(array, 3);

			System.out.println("validIndexの呼び出し終了");
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentExceptionが発生しました");
			e.printStackTrace();
		}

		// try-catch文を記述
        // ・throwSQLExceptionメソッドを呼び出し
        // ・SQLExceptionをキャッチして、メッセージとスタックトレースを出力
        // ・"throwSQLExceptionの呼び出し終了"のメッセージを出力

		System.out.println("mainメソッド終了");
	}

	// validIndexメソッドを作成
    // ・indexがarrayのサイズの範囲内なら、インデックスの要素を出力
    // ・サイズの範囲外なら、IllegalArgumentExceptionをスロー

	public static void validIndex(int[] array, int index) {
		// ifで要素が超えている場合を分岐
		// 配列のindexは0から始まるため今回の場合0,1,2となるため3を超えると範囲外
		if (array.length <= index) {
			// 例外分を出力
			throw new IllegalArgumentException(index + "はサイズの範囲外です");
		}
		// array[index]でindexの数字を持ってくる→indexは"0"から始まる
		System.out.println("インデックス" + index + "の要素は" + array[index] + "です");
	}

	public static void throwSQLException() throws SQLException {
		throw new SQLException("SQLエラーです");
	}
}
