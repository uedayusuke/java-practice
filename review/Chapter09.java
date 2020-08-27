package review;

public class Chapter09 {
	// 9章【クラスとメソッドを理解しよう】 復習
	// 確認問題
	public static void main(String[] args) {
		// 燃料（Km/L）
		double fuelCost = 12.5;
		// 残量（L）
		double fuelAmount = 55.0;

		Car car = new Car(fuelCost, fuelAmount);

		car.move(20);
		// System.out.println("残量は、" + car.getFuelAmount() + "です");
	}
}
