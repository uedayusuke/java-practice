
public class Chapter08 {
	public static void main(String[] args) {
		// 8章確認問題
		// 問題1 while文
		int number = 1;
		while (number < 5) {
			System.out.println(number * number);
			number ++;
		}

		// 問題2 for文
		int[] array = {0, 1, 2, 3};
		for (int i = 0; i < array.length; i ++) {
			System.out.println(array[i]);
		}

		// 問題3 拡張for文
		for (int num : array) {
			if (num % 2 == 0) {
				continue;
			}
			System.out.println(num);
		}
	}
}
