package sbA;
public class ShowRoom1 {
	String car_Name2;
	int Manufacture_Year2;
	public String getCar_Name2() {
		return car_Name2;
	}
	public void setCar_Name2(String car_Name2) {
		this.car_Name2 = car_Name2;
	}
	public int getManufacture_Year2() {
		return Manufacture_Year2;
	}
	public void setManufacture_Year2(int manufacture_Year2) {
		Manufacture_Year2 = manufacture_Year2;
	}
	public ShowRoom1(String car_Name2, int manufacture_Year2) {
		super();
		this.car_Name2 = car_Name2;
		Manufacture_Year2 = manufacture_Year2;
	}
	@Override
	public String toString() {
		return "ShowRoom1 [car_Name2=" + car_Name2 + ", Manufacture_Year2=" + Manufacture_Year2 + "]";
	}
public ShowRoom1() {}

}



