
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

		// 代入演算子
		int e;

		// 代入
		e = 10;
		System.out.println(e);
		//加算代入
		e += 5;
		System.out.println(e);
		// 減算代入
		e -= 3;
		System.out.println(e);
		// 乗算代入
		e *= 4;
		System.out.println(e);
		// 除算代入
		e /= 2;
		System.out.println(e);
		// 剰余算代入
		e %= 7;
		System.out.println(e);

		// 関係（比較）演算子
		int f = 5;
		boolean g;

		//小なり
		g = f < 5;
		System.out.println(g);
		// 小なりイコール
		g = f <= 5;
		System.out.println(g);
		// 大なり
		g = f > 4;
		System.out.println(g);
		// 大なりイコール
		g = f >= 6;
		System.out.println(g);
		// 等価
		g = f == 6;
		System.out.println(g);
		// 不等価
		g = f != 6;
		System.out.println(g);

		// 論理演算子
		boolean h = true;
		boolean i = false;
		boolean j;

		//論理積（AND）
		j = h && true;
		System.out.println(j);
		j = h && false;
		System.out.println(j);
		j = i && false;
		System.out.println(j);
		// 論理和（OR）
		j = i || true;
		System.out.println(j);
		j = i || false;
		System.out.println(j);
		// 否定（NOT）
		j = !h;
		System.out.println(j);
		j = !i;
		System.out.println(j);

		// 文字列の連結
		String k = "100";
		String l = "200";
		String m;
		m = k + l;
		System.out.println(m);
		m = "あ" + "い";
		System.out.println(m);


	}
}
