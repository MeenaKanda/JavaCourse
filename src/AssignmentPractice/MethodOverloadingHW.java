package AssignmentPractice;

public class MethodOverloadingHW {
	
	//1.Consider a food delivery system and try to overload following features:
    //	feature1 : Login with : all the methods will return boolean (true/false)
    //	phone, password
    //	phone, otp
    //	username, password
    //	username, password, otp
	
	public boolean foodDelivery(String phone , String password) {
		return false;
	}
	public boolean foodDelivery(String phone, double otp) {
		return false;
	}
	public boolean foodDelivery(String username, int password) {
		return true;
	}
	public boolean foodDelivery(String username, int password ,int otp) {
		return true;
	}
	

	public static void main(String[] args) {
		
		MethodOverloadingHW me = new MethodOverloadingHW();
		if(me.foodDelivery("meena", 1234)) {
			System.out.println("login");
		}
		else{
			System.out.println("no login");
		}
		
		if(me.foodDelivery("12345566", "2344")) {
			System.out.println("no login");
		}

	}

}
