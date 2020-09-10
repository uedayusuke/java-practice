package capsule.human;

public class HumanNoCapsule {
	// 12章【カプセル化を理解しよう】

	// publicをアクセス修飾子に設定し、外部から参照可能
	public String name;
	public int age;

	public HumanNoCapsule(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
