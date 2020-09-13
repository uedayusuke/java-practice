package extend.animal;
//13章【継承を理解しよう】

/*
抽象クラスの基本構文
↓クラスの宣言
アクセス修飾子 abstract class クラス名 {
	↓抽象メソッド(宣言のみ!!)
	アクセス修飾子 abstract 戻り値の型 メソッド名(引数);
}
 */
public abstract class Animal {
	protected String name;

	public void eat() {
		System.out.println(name + "が食事をしました。");
	}

	// 抽象メソッド
	public abstract void cry();
}
