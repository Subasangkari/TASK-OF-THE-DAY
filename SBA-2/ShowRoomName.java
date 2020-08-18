package sbA;

import java.util.List;

public class ShowRoomName {
	private String showRoomName;
	private int showRommID;
	List<showRoom>cars;

	public String getShowRoomName() {
		return showRoomName;
	}

	public void setShowRoomName(String showRoomName) {
		this.showRoomName = showRoomName;
	}

	public int getShowRommID() {
		return showRommID;
	}

	public void setShowRommID(int showRommID) {
		this.showRommID = showRommID;
	}

	public List<showRoom> getCars() {
		return cars;
	}

	public void setCars(List<showRoom> cars) {
		this.cars = cars;
	}

	public ShowRoomName(String showRoomName, int showRommID, List<showRoom> cars) {
		super();
		this.showRoomName = showRoomName;
		this.showRommID = showRommID;
		this.cars = cars;
	}
	public List<showRoom>getcars(){
		return cars;
	}
	public void setcars(List<showRoom>cars) {
		this.cars=cars;
	}

	@Override
	public String toString() {
		return "ShowRoomName [showRoomName=" + showRoomName + ", showRommID=" + showRommID + ", cars=" + cars + "]";
	}
public ShowRoomName() {}
}
