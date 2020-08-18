
public class training08 {
	public static void main(String[] args) {
		// 8章【繰り返しを学ぼう】
		// while文
		int number = 1;
		while (number < 50) {
			number *= 2;
			System.out.println("training08 = " + number);
		}

		//do-while文
		number = 1;
		do {
			number *= 2;
			System.out.println("training08 = " + number);
		}while (number < 50);
	}
}
