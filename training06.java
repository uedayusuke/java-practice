
public class training06 {
	public static void main(String[] args) {
		// 6章【演算子を学ぼう】
		// 算術演算子
		int a;
		a = 15;
		int c ;
		// 加算
		c = a + 3;
		System.out.println(c);
		// 減算
		c = a - 5;
		System.out.println(c);
		// 乗算
		c = a * 2;
		System.out.println(c);
		// 除算
		c = a / 6;
		System.out.println(c);
		// 剰余算
		c = a % 4;
		System.out.println(c);

		// インクリメント・デクリメント演算子
		a = 10;
		a++;
		System.out.println(a);
		a = 10;
		a--;
		System.out.println(a);

		// 前置と後置
		int b;
		int d;

		b = 5;
		d = ++b;
		System.out.println(b);
		System.out.println(d);

		b = 5;
		d = b++;
		System.out.println(b);
		System.out.println(d);


	}
}
