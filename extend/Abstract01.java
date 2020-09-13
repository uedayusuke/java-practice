package extend;

import extend.animal.Dog;

public class Abstract01 {
	// 13章【継承を理解しよう】
	public static void main(String[] args) {
		Dog dog = new Dog();
		// サブクラスを通して、Animalクラス(抽象)を呼び出し
		dog.eat();
		dog.cry();

		// 抽象クラスはインスタンスを生成できないので要注意!!

	}

}
