package sbA;

import java.util.List;

public class ShowRoomName1 {
	private String show_Room_Name;
	private int show_Room_ID;
	List<ShowRoom1>cars5;
	public String getShow_Room_Name() {
		return show_Room_Name;
	}
	public void setShow_Room_Name(String show_Room_Name) {
		this.show_Room_Name = show_Room_Name;
	}
	public int getShow_Room_ID() {
		return show_Room_ID;
	}
	public void setShow_Room_ID(int show_Room_ID) {
		this.show_Room_ID = show_Room_ID;
	}
	public List<ShowRoom1> getCars5() {
		return cars5;
	}
	public void setCars5(List<ShowRoom1> cars5) {
		this.cars5 = cars5;
	}
	public ShowRoomName1(String show_Room_Name, int show_Room_ID, List<ShowRoom1> cars5) {
		super();
		this.show_Room_Name = show_Room_Name;
		this.show_Room_ID = show_Room_ID;
		this.cars5 = cars5;
	}
	@Override
	public String toString() {
		return "ShowRoomName1 [show_Room_Name=" + show_Room_Name + ", show_Room_ID=" + show_Room_ID + ", cars5=" + cars5
				+ "]";
	}
	public ShowRoomName1() {}
	}