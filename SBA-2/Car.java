package sbA;

public class Car implements Comparable <Car> {
	String car_Name;
	int Manufacture_Year;
	public String getCar_Name() {
		return car_Name;
	}
	public void setCar_Name(String car_Name) {
		this.car_Name = car_Name;
	}
	public int getManufacture_Year() {
		return Manufacture_Year;
	}
	public void setManufacture_Year(int manufacture_Year) {
		Manufacture_Year = manufacture_Year;
	}
	public Car(String car_Name, int manufacture_Year) {
		super();
		this.car_Name = car_Name;
		Manufacture_Year = manufacture_Year;
	}
	@Override
	public String toString() {
		return "Car [car_Name=" + car_Name + ", Manufacture_Year=" + Manufacture_Year + "]";
	}
	public Car() {}
	@Override
	public int compareTo(Car o) {
		return this.car_Name.compareTo(o.car_Name);
				//return o.Manufacture_Year-this.Manufacture_Year;
	}
	

}
