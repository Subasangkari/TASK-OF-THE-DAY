package sbA;

public class showRoom {
	String carName;
	int ManufactureYear;
	

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}


	public int getManufactureYear() {
		return ManufactureYear;
	}


	public void setManufactureYear(int manufactureYear) {
		ManufactureYear = manufactureYear;
	}

	public showRoom(String carName, int manufactureYear) {
		super();
		this.carName = carName;
		ManufactureYear = manufactureYear;
	}
	

	@Override
	public String toString() {
		return "showRoom [carName=" + carName + ", ManufactureYear=" + ManufactureYear + "]";
	}

	}
