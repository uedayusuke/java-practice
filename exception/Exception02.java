package exception;

public class Exception02 {
	// 10章【例外の基本を学ぼう】復習
	// try-catch文
	public static void main(String[] args) {
		try {
			// tryブロック：例外が発生しそうな処理を記述
			System.out.println("100 ÷ 0 は？");
			// 0で割ることはできないので例外が発生
			int result = 100 / 0;
			System.out.println("計算結果" + result);
		// ArithmeticExceptionの例外が出た時の処理を記述
		} catch (ArithmeticException e) {
			// 例外が一致したので実行
			System.out.println("例外が発生");
		// finallyは例外の有無に関わらず実行される
		} finally {
			System.out.println("プログラム終了");
		};
	};
};
