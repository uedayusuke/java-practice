package polymorphism;

import polymorphism.human.Employee;
import polymorphism.human.Human;
import polymorphism.human.Student;

// 14章【ポリモーフィズムを理解しよう】
public class Polymorphism01 {
	public static void main(String[] args) {
		// Studentクラスのインスタンスを生成し、変数を代入
		Human human1 = new Student("佐藤", 17, 70);
		// オーバーライドしてるので、Studentクラスのメソッドが実行される。
		System.out.println("Humanクラスのメソッド:プロフィールを紹介します。" + human1.getProfile());

		// Employeeクラスのインスタンスを生成し、変数を代入
		Human human2 = new Employee("田中", 28, "システム部");
		// オーバーライドしてるので、Employeeクラスのメソッドが実行される。
		System.out.println("Humanクラスのメソッド:プロフィールを紹介します。" + human2.getProfile());
	}

}
