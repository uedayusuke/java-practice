package review;

public class Car {
	// 9章【クラスとメソッドを理解しよう】 復習
	// 確認問題

	//宣言
	// 燃料（Km/l）
	private double fuelCost;
	// 残量（L）
	private double fuelAmount;

	// コンストラクタ（代入）
	public Car(double fuelCost, double fuelAmount) {
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}

	public void move(int km) {
		// 距離の出力
		System.out.println(km + "km走ります");
		// 残量を計算
		this.fuelAmount -= (km/fuelCost);
	}

	public double getFuelAmount() {
		return this.fuelAmount;
	}
}
