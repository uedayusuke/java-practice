package exception;

public class Exception01 {
	// 10章【例外の基本を学ぼう】復習
	public static void main(String[] args) {
		System.out.println("100 ÷ 0 は？");
		// 0で割ったため例外が発生
		int result = 100 / 0;
		// 例外が発生したため以下は実行されない
		System.out.println("計算結果" + result);
		System.out.println("プログラム終了");
	}
}
