package practice12;

public class Chapter12 {
	// 12章 確認問題
	public static void main(String[] args) {
		CapsuleMan man = new CapsuleMan("小林", 32);
		System.out.println("名前は" + man.getName() + "です。");
		System.out.println("年齢は" + man.getAge() + "です。");
		man.age = 33;
		System.out.println("誕生日を迎えたので、年齢が" + man.getAge() + "になりました。");
	}
}
