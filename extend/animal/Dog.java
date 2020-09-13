package extend.animal;

public class Dog extends Animal {
	// 13章【継承を理解しよう】
	public Dog() {
		this.name = "犬";
	}

	public void cry() {
		System.out.println(this.name + "が吠えました。ワン！ワン！");
	}

}
