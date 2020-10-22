package inner_class;

//1章【内部クラスについて学ぼう】
public class Example {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
	}
}
