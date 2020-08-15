
public class Chapter05 {
	public static void main(String[] args) {
		// プリミティブ型
		// long型に値を代入して出力
		long long1;
		long1 = 100000L;
		System.out.println(long1);

		// double型に値を代入して出力
		double double1;
		double1 = 0.14;
		System.out.println(double1);

		// boolean型に値を代入して出力
		boolean boolean1;
		boolean1 = false;
		System.out.println(boolean1);

		// ラッパークラス
		// Floatに値を代入して出力
		Float float1;
		float1 = 3.14f;
		System.out.println(float1);

		// Integerに値を代入して出力
		Integer int1;
		int1 = 1122;
		System.out.println(int1);

		// Characterに値を代入して出力
		Character char1;
		char1 = 'う';
		System.out.println(char1);

		// 配列
		// 要素数が5の「int」配列に値を代入して、インデックス番号が3の値を出力
		int[] array = new int[5];
		array[0] = 0;
		array[1] = 1;
		array[2] = 2;
		array[3] = 3;
		array[4] = 4;
		System.out.println(array[3]);

		int[] array2 = new int[] { 5, 6, 7, 8, 9, 10 };
		System.out.println(array2[3]);

		int[] array3 = { 11, 12, 13, 14, 15 };
		System.out.println(array3[3]);


	}
}
