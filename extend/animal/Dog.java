package extend.animal;

// "extends"で抽象クラスAnimalを継承
public class Dog extends Animal {
	// 13章【継承を理解しよう】
	public Dog() {
		this.name = "犬";
	}

	// 抽象メソッドは宣言のみのため、サブクラスでオーバーライド(必須!!)
	public void cry() {
		System.out.println(this.name + "が吠えました。ワン！ワン！");
	}

}
