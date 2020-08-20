package practice;

public class Car {
	// 燃料(Km/L)
	private double fuelCost;
	// 残量(L)
	private double fuelAmount;

	public Car(double fuelCost, double fuelAmount) {
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}

	public void move(int km) {
		System.out.println(km + "km走ります");
		this.fuelAmount -= (km / fuelCost);
	}

	public double getFuelAmount() {
		return this.fuelAmount;
	}
}
