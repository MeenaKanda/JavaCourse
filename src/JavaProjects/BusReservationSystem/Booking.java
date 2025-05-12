package JavaProjects.BusReservationSystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {

	private String passengerName;
	private int busNo;
	private Date date;

//	Scanner scanner = new Scanner(System.in);

	public Booking() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Passenger Name :");
		passengerName = scanner.next();

		System.out.println("Enter Bus No :");
		busNo = scanner.nextInt();

		System.out.println("Enter Date mm-dd-yyyy: ");
		String dateStr = scanner.next();

		SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-YYYY");
		try {
			date = dateFormat.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {

		int capacity = 0;
		for (Bus bus : buses) {
			if (bus.getBusNo() == busNo) {
				capacity = bus.getCapacity();
			}
		}

		int booked = 0;
		for (Booking booking : bookings) {
			if (booking.busNo == busNo && booking.date.equals(date)) {
				booked++;
			}
		}

		System.out.println("Bus capacity = " + capacity + " booked capacity = " + booked);

		if (booked < capacity)
			return true;

		else
			return false;
	}

}
