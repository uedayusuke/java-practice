package extend.animal;

public abstract class Animal {
	// 13章【継承を理解しよう】
	protected String name;

	public void eat() {
		System.out.println(name + "が食事をしました。");
	}

	public abstract void cry();
}
