
public class carDetails {
	private String carMake;
	private String carModel;
	private int carYear;
	private double carPrice;

	public String getCarMake() {
		return carMake;
	}
	public carDetails(String carMake, String carModel, int carYear, double carPrice) {
		this.carMake =carMake;
		this.carModel =carModel;
		this.carYear =carYear;
		this.carPrice =carPrice;
		
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public int getCarYear() {
		return carYear;
	}

	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}

	public double getPrice() {
		return carPrice;
	}

	public void setPrice(double price) {
		this.carPrice = price;
	}
	@Override
	public String toString() {
		
	//return carMake + " " + carModel + " " + carYear + " " + carPrice;
	return String.format("%-20s %-20s %-15s %s %15.2f\n", carModel, carMake, carYear, '$',carPrice);
}
}