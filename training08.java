
public class training08 {
	public static void main(String[] args) {
		// 8章【繰り返しを学ぼう】
		// while文
		int number = 100;
		while (number < 50) {
			number *= 2;
			System.out.println("while = " + number);
		}

		//do-while文
		number = 1;
		do {
			number *= 2;
			System.out.println("do-while = " + number);
		}while (number < 50);
		// while文とdo-while文の違いは一番最初の処理をやるかやらないか

		// for文
		for (int num = 1; num <= 5; num++) {
			System.out.println("for = " + num);
		}

		// 拡張for文
		int[] array = { 1, 2, 3, 4, 5};
		System.out.println(array[0]);
		for (int num2 : array) {
			System.out.println("拡張for = " + num2);
		}

		// break文
		for (int count = 0; count < 5; count ++) {
			if (count == 4) {
				break;
			}
			System.out.println("break = " + count);
		}
	}
}
