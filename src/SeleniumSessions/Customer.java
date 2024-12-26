package SeleniumSessions;

import java.util.Arrays;

public class Customer {

	public String[] getEmployeeDevices(String empName) {
		System.out.println("getting devices information for employee: " + empName);

		if (empName.equals("Ravi")) {
			String devices[] = { "macbook pro", "ipad", "iph13" };
			return devices;
		}
		if (empName.equals("Om")) {
			String devices[] = { "windows 10", "samsung s10" };
			return devices;
		}
		if (empName.equals("Rashmi")) {
			String devices[] = { "windows 10", "samsung s11", "iphone13", "airtel SIM" };
			return devices;
		} else {
			System.out.println("emp name is not found...");
			return null; // array is non-pri data type so return is null
		}

	}

	public static void main(String[] args) {

		Customer obj = new Customer();
		String d[] = obj.getEmployeeDevices("Ravi");
		System.out.println(Arrays.toString(d));
		System.out.println(d.length);

	}

}
