package exception;

import java.sql.SQLException;

public class Chapter10 {
	// 10章 確認問題
	public static void main(String[] args) {
		try {
			int array[] = {1, 3, 5};
			chapter10.varidIndex(array, 2);
			chapter10.varidIndex(array, 3);

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

	public static void throwSQLException() throws SQLException {
		throw new SQLException("SQLエラーです");
	}
}
