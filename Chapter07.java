
public class Chapter07 {
	public static void main(String[] args) {
		// 問題1
		int dt = 90;
		if (dt <= 5) {
			System.out.println("とても近いです");
		} else if (dt <= 10) {
			System.out.println("まぁ近いです");
		} else if (dt <= 15) {
			System.out.println("まぁ遠いです");
		} else {
			System.out.println("とても遠いです");
		}

		// 問題2
		String signal = "blue";
		switch (signal) {
			case "red":
				System.out.println("赤信号です");
				break;
			case "yellow":
				System.out.println("黄信号です");
				break;
			case "blue":
				System.out.println("青信号です");
				break;
			default:
				System.out.println("信号の色ではありません");
		}

	}
}
