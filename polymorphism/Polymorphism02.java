package polymorphism;

import polymorphism.human.Human;
import polymorphism.human.Student;

//14章【ポリモーフィズムを理解しよう】
public class Polymorphism02 {
	public static void main(String[] args) {
		// スーパークラス(Humanクラス)の変数に代入
		Human human = new Student("佐藤", 17, 70);

		// コンストラクタ生成
		Polymorphism02 polymorphism = new Polymorphism02();

		polymorphism.printName();
		polymorphism.printName("松本");
		polymorphism.printName("松本", "清水");
		polymorphism.printName(human);
	}

	public void printName() {
		System.out.println("中川です。");
	}

	public void printName(String name) {
		System.out.println(name + "です。");
	}

	public void printName(String name1, String name2) {
		System.out.println(name2 + "と" + name1 + "です。");
	}

	public void printName(Human human) {
		System.out.println(human.getName() + "です。");
	}
}
