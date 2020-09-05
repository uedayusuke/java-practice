package exception;

public class Exception03 {
	// 10章【例外の基本を学ぼう】復習
	// throw文
	public static void main(String[] args) {
		try {
			Exception03.division(100, 0);
		// ArithmeticExceptionが発生した時の例外処理
		} catch (ArithmeticException e) {
			// 一致しないので処理されない
			System.out.println("ArithmeticException例外が発生");
		// IllegalArgumentExceptionが発生した時の例外処理
		} catch (IllegalArgumentException e) {
			// 一致したので処理される
			System.out.println("IllegalArgumentException例外が発生");
			// "throw 例外インスタンス"で例外インスタンスをスロー
			throw e;
		}
		System.out.println("プログラム終了");
	}

	public static void division(int a, int b) {
		System.out.println(a + "÷" + b + "は？");
		if (b == 0) {
			// "throw new 例外クラス"で例外インスタンスを作ってスロー
			throw new IllegalArgumentException("引数が不正です");
		}
		int result = a / b;
		System.out.println("計算結果は" + result);
	}
}
