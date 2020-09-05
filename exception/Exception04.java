package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception04 {
	// 10章【例外の基本を学ぼう】復習
	// throw文
	public static void main(String[] args) {
		try {
			// わざと存在しないファイルの読み込みを命令
			Exception04.readFile("exception.txt");
		// 呼び出し元でも例外処理を追加→コンパイルエラーになるため
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException例外が発生");
		}
		System.out.println("プログラム終了");
	}

	// throwsでFileNotFoundException例外をスロー
	public static void readFile(String fileName) throws FileNotFoundException {
		System.out.println("ファイルの読み込み開始");
		// ファイルが存在しないので例外発生
		FileReader fr = new FileReader(fileName);
		System.out.println(fileName + "の読み込み完了");
	}
}
