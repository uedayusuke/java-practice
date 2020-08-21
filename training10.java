
public class training10 {
	public static void main(String[] args) {
		// 10章【例外の基本を学ぼう】
		// 例外の基本
		System.out.println("100 ÷ 0 は?" );
		//int result = 100 / 0;
		//System.out.println("計算結果" + result);
		//System.out.println("プログラム終了");

		// 例外処理
		// try-catch文（try-catch-finally文）
		try {
			System.out.println("100 ÷ 0 は?");
			int result2 = 100 /0;
			System.out.println("計算結果" + result2);
		} catch (ArithmeticException e) {
			System.out.println("例外が発生");
		} finally {
			System.out.println("プログラム終了");
		}
	}
}
