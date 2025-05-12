package JavaProjects.BusReservationSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int userOpt = 1;
		
		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		
		buses.add(new Bus(1, 5 , true));
		buses.add(new Bus(2, 3 , false));
		buses.add(new Bus(3, 4 , true));
		buses.add(new Bus(4, 10 , false));
		buses.add(new Bus(5, 3 , true));
		
		
		for(Bus b : buses) {
			b.displayBusInfo();
		}
		
		while (userOpt == 1) {
			System.out.println("Enter 1 for booking & 2 for Exit");
			userOpt = scanner.nextInt();

			if (userOpt == 1) {
				Booking booking = new Booking();
				if(booking.isAvailable(bookings, buses)) {
					bookings.add(booking);
					
					System.out.println("Your booking is confirmed");
					
				}
				else {
					System.out.println("Sorry bus is full. Try another Bus or Date.");
				}
			}

		}

	}

}
