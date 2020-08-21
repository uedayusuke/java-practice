package training;

import java.io.FileNotFoundException;
import java.io.FileReader;

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

		/* throw文
		try {
			training10.division(100, 0);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException例外が発生");
			throw e;
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException例外が発生");
			throw e;
		} finally {
			System.out.println("プログラム終了");
		} */

		// throws文
		try {
			training10.readFile("exception.txt");
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException例外が発生");
		}
		System.out.println("プログラム終了");

	}

	public static void division(int a, int b) {
		System.out.println(a + "÷" + b + "は?");
		if (b == 0) {
			throw new IllegalArgumentException("引数が不正です");
		}
		int result3 = a / b;
		System.out.println("計算結果" + result3);
	}

	public static void readFile(String fileName) throws FileNotFoundException {
		System.out.println("ファイルの読み込み開始");
		FileReader fr = new FileReader(fileName);
		System.out.println(fileName + "の読み込み完了");
	}
}
