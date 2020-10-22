package inner_class;

//1章【内部クラスについて学ぼう】
public class Example {
	public static void main(String[] args) {
		// クラスOuterをインスタンス化
		Outer outer = new Outer();
		// クラスOuterの内部クラスInnerをインスタンス化
		Outer.Inner inner = new Outer.Inner();
	}
}
