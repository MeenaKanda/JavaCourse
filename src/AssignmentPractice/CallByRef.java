package AssignmentPractice;

public class CallByRef {

	String name;
	String color;
	int price;
	String brand;
	String type;
	
	public void speed(int a, int b) {
		System.out.println(a+b);
	}
	
	public void parking(CallByRef ref) {
		ref.name = "Audi";
		ref.color = "Black";
		ref.price = 2000000;
		ref.brand = "Jeep";
		
		System.out.println(ref.name + ref.color + ref.price + ref.brand + ref.type);
	}
	
	public void autoSpeed(CallByRef cr) {
		cr.name = "Honda";
		cr.color = "white";
		cr.price = 1450000;
		System.out.println(cr.name + cr.color + cr.price + cr.brand + cr.type);
	}
	
	public static void main(String[] args) {
	
		CallByRef r = new CallByRef();
		r.speed(1200, 1500);
		r.parking(r);
		r.brand = "CAR";
		r.type ="modern";
		r.name = "BMW";
		System.out.println(r.name + r.color + r.price + r.brand + r.type);
		
		r.autoSpeed(r);
		r.type = "classic";
		System.out.println(r.name + r.color + r.price + r.brand + r.type );
	}

}
