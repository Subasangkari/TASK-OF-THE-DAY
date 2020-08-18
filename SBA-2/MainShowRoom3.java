package sbA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MainShowRoom3 {
	class YearSort implements Comparator<ShowRoom1>{
		@Override
		public int compare(ShowRoom1 s1,ShowRoom1 s2) {
			return s1.Manufacture_Year2-s2.Manufacture_Year2;
		}
	}
	class NameSort implements Comparator<ShowRoom1>{
		@Override
		public int compare(ShowRoom1 s,ShowRoom1 s3) {
			return s.getCar_Name2().compareTo(s3.getCar_Name2());
		}
	
}
	
	Map<String,List<ShowRoom1>>ShowRoomDetails;
	public void displayCarsByShowRoomName(String showRoomName) {
		List<ShowRoom1>cars5=ShowRoomDetails.get(showRoomName);
		Collections.sort(cars5,new YearSort() );
		for(ShowRoom1 car:cars5) {
			System.out.println(car);
		}
System.out.println("---------------------------------------");
Collections.sort(cars5,new NameSort() );
for(ShowRoom1 car:cars5) {
	System.out.println(car);
}

		}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ShowRoom1 car1=new ShowRoom1("Sedan A3",2020);
ShowRoom1 car2=new ShowRoom1("Audi A8L",2018);
ShowRoom1 car3=new ShowRoom1("Sportback",2019);

List<ShowRoom1>cars5=new ArrayList<ShowRoom1>();
cars5.add(car1);
cars5.add(car2);
cars5.add(car3);
ShowRoomName1 s1=new ShowRoomName1("Audi",101, cars5);

ShowRoom1 car4=new ShowRoom1("E-class",2017);
ShowRoom1 car5=new ShowRoom1("CLA-4 Door coupe",2019);
ShowRoom1 car6=new ShowRoom1("S-class",2016);
List<ShowRoom1>cars6=new ArrayList<ShowRoom1>();
cars6.add(car4);
cars6.add(car5);
cars6.add(car6);
ShowRoomName1 s2=new ShowRoomName1("Merecedes-Benz",102, cars6);


MainShowRoom3 s=new MainShowRoom3();

s.ShowRoomDetails=new HashMap<String,List<ShowRoom1>>();
s.ShowRoomDetails.put(s1.getShow_Room_Name(),s1.getCars5());
s.ShowRoomDetails.put(s2.getShow_Room_Name(),s2.getCars5());
s.displayCarsByShowRoomName("Audi");



	}

}
