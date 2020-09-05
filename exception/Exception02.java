package exception;

public class Exception02 {
	// 10章【例外の基本を学ぼう】復習
	// try-catch文
	public static void main(String[] args) {
		try {
			System.out.println("100 ÷ 0 は？");
			int result = 100 / 0;
			System.out.println("計算結果" + result);
		} catch (ArithmeticException e) {
			System.out.println("例外が発生");
		} finally {
			System.out.println("プログラム終了");
		};
	};
};
