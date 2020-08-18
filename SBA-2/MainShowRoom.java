package sbA;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class MainShowRoom {
	Map<String,List<showRoom>>showRoomDetails;
	public void displayCarsByShowRoomName(String showRoomName) {
		List<showRoom>cars=showRoomDetails.get(showRoomName);
		for(showRoom car:cars) {
			System.out.println(car);
		}		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
showRoom car1=new showRoom("Sedan A3",2020);
showRoom car2=new showRoom("Audi A8L",2018);
showRoom car3=new showRoom("Sportback",2019);

List<showRoom>cars=new Vector<showRoom>();
cars.add(car1);
cars.add(car2);
cars.add(car3);
ShowRoomName s1=new ShowRoomName("Audi",101, cars);

showRoom car4=new showRoom("E-class",2017);
showRoom car5=new showRoom("CLA-4 Door coupe",2019);
showRoom car6=new showRoom("S-class",2016);
List<showRoom>cars1=new Vector<showRoom>();
cars1.add(car4);
cars1.add(car5);
cars1.add(car6);
ShowRoomName s2=new ShowRoomName("Merecedes-Benz",102, cars1);

MainShowRoom s=new MainShowRoom();

s.showRoomDetails=new HashMap<String,List<showRoom>>();
s.showRoomDetails.put(s1.getShowRoomName(),s1.getcars());
s.showRoomDetails.put(s2.getShowRoomName(),s2.getcars());
s.displayCarsByShowRoomName("Merecedes-Benz");

	}

}