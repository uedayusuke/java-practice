
public class Null01 {
	public static void main(String[] args) {
		String string1;
		string1 = "あいう";
		System.out.println(string1 + "の文字数:" + string1.length());

		string1 = "";
		System.out.println(string1 + "の文字数:" + string1.length());

		string1 = null;
		System.out.println(string1 + "の文字数:" + string1.length());

		Integer integer1 = 5;
		Integer integer2 = Integer.valueOf(5);
		int int1 = integer1;
		int int2 = integer2.intValue();

		int[] array1 = new int[3];
		array1[0] = 60;
		array1[2] = 20;
		array1[1] = 20;
		int int3 = array1[2];

		int array2[] = null;

		int[] array3 = new int[] { 10, 20, 50 };
		int[] array4 = { 10, 20, 50};

	}
}
