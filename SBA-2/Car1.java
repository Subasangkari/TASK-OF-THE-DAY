package sbA;

public class Car1 implements Comparable<Car1>{
	String car_Name1;
	int Manufacture_Year1;
	public String getCar_Name1() {
		return car_Name1;
	}
	public void setCar_Name1(String car_Name1) {
		this.car_Name1 = car_Name1;
	}
	public int getManufacture_Year1() {
		return Manufacture_Year1;
	}
	public void setManufacture_Year1(int manufacture_Year1) {
		Manufacture_Year1 = manufacture_Year1;
	}
	public Car1(String car_Name1, int manufacture_Year1) {
		super();
		this.car_Name1 = car_Name1;
		Manufacture_Year1 = manufacture_Year1;
	}
	@Override
	public String toString() {
		return "Car1 [car_Name1=" + car_Name1 + ", Manufacture_Year1=" + Manufacture_Year1 + "]";
	}
	public Car1() {}
	
	@Override
	public int compareTo(Car1 o) {
		return o.Manufacture_Year1-this.Manufacture_Year1;
	}
	
}
