package extend;

import extend.human.Employee;
import extend.human.Human;
import extend.human.Student;

public class Extend01 {
	// 13章【継承を理解しよう】
	public static void main(String[] args) {
		// Humanクラスのインスタンスを生成
		Human sugimoto = new Human("杉本", 16);
		System.out.println("Humanクラスのメソッド:名前は、" + sugimoto.getName());

		// Sutudentクラスのインスタンスを生成
		Student sato = new Student("佐藤", 17, 70);
		System.out.println("Humanクラスのメソッド:名前は、" + sato.getName());
		System.out.println("Studentクラスのメソッド:プロフィールを紹介します。" + sato.getStudentProfile());

		// Employyeクラスのインスタンスを生成し、アップキャストでHumanクラスを生成
		// アップキャスト:サブクラスのインスタンス(Employee)をスーパークラスの変数(human)に代入する
		Human human = new Employee("田中", 28, "システム部");
		System.out.println("Humanクラスのメソッド:名前は" + human.getName());

		// Employyeクラスの変数にダウンキャスト
		// ダウンキャスト:スーパクラス(human)からサブクラス(Employye)に代入→明示する必要あり
		Employee tanaka = (Employee) human;
		// Employyeクラスの変数なので、getEmployeeProfile()を呼び出せる
		System.out.println("Humanクラスのメソッド:プロフィールを紹介します。" + tanaka.getEmployeeProfile());

		// printNmaeメソッドを呼び出し
		Extend01.printName(sugimoto);
		Extend01.printName(sato);
		Extend01.printName(tanaka);
	}

	public static void printName(Human human) {
		System.out.println("Humanクラスのメソッド:名前は、" + human.getName());
	}
}
