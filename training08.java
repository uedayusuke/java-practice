
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
	}
}
