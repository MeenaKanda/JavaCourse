package JavaProjects.BusReservationSystem;

import java.util.Date;

public class Bus {

	private int busNo;
	private int capacity;
	private boolean ac;

	public Bus(int busNo, int capacity, boolean ac) {
		this.busNo = busNo;
		this.capacity = capacity;
		this.ac = ac;
	}
	
	public int getCapacity() {  //Accessor Method
		return capacity;
	}
	
	public void setCapacity(int cap) { //Mutator
		this.capacity = cap;
	}

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public void displayBusInfo() {
		System.out.println("Bus No = " + busNo + " :: Ac = " + ac + " :: Capacity of bus = " + capacity);
	}
	
	
}
