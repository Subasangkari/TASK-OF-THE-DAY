package sbA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainShowRoom2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Car> cars =new ArrayList<Car>();
Car c1 = new Car("Sedan A3",2020);
Car c2 = new Car("Audi A8L",2018);
Car c3 = new Car("Sportback",2019);

cars.add(c1);
cars.add(c2);
cars.add(c3);




Collections.sort(cars);
	for(Car car:cars) {
		System.out.println(car);
	}
	}
	
	
}
