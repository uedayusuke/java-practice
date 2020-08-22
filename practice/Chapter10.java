package practice;

public class Chapter10 {
	public static void main(String[] args) {
		// 10章 確認問題
		try {
            int array[] = { 1, 3, 5 };
            Chapter10.validIndex(array, 2);
            Chapter10.validIndex(array, 3);

            System.out.println("validIndexの呼び出し終了");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentExceptionが発生しました");
            e.printStackTrace();
        }

	}
}
