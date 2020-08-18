package sbA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainShowRoom1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Car1> cars1 =new ArrayList<Car1>();
		Car1 c1 = new Car1("Sedan A3",2020);
		Car1 c2 = new Car1("Audi A8L",2018);
		Car1 c3 = new Car1("Sportback",2019);

		cars1.add(c1);
		cars1.add(c2);
		cars1.add(c3);
		Collections.sort(cars1);
		for(Car1 car1:cars1) {
			System.out.println(car1);
		}
		}


	}


