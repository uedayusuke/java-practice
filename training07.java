
public class training07 {
	public static void main(String[] args) {
		// 7章【条件分岐を学ぼう】
		// if文
		int number = 80;
		if (number < 5) {
			System.out.println(number + "は5未満です");
		}
		if (number < 10) {
			System.out.println(number + "は10未満です");
		}
		if (number < 15) {
			System.out.println(number + "は15未満です");
		}

		// else-if文、else文
		if (number < 5) {
			System.out.println(number + "は5未満です");
		} else if (number < 10) {
			System.out.println(number + "は5以上、10未満です");
		} else if (number < 15) {
			System.out.println(number + "は10以上、15未満です");
		} else {
			System.out.println(number + "は15未満ではないです");
		}

		// switch文
		int val = 3;
		switch (val) {
		case 3:
			System.out.println("よくできました！！");
			break;
		case 2:
			System.out.println("まぁまぁだね！");
			break;
		default:
			System.out.println("頑張ろう...");
			break;
		}
	}
}
