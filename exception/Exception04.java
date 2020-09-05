package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception04 {
	// 10章【例外の基本を学ぼう】復習
	// throw文
	public static void main(String[] args) {

	}

	public static void readFile(String fileName) throws FileNotFoundException {
		System.out.println("ファイルの読み込み開始");
		FileReader fr = new FileReader(fileName);
		System.out.println(fileName + "の読み込み完了");
	}
}
