package OOP_Constructor;

public class CarTest {

	public static void main(String[] args) {
		
		
		//added the car data:
		Car c1 = new Car("Audi",50);
		
		Car c2 = new Car("BMW","white");
	
		Car c3 = new Car("Honda", 20, false);
		
		Car c4 = new Car("Tesla", "Black", 90, true);
		
		
		//fetching the data for the cars:
		
		System.out.println(c1.name + " " +c1.color + " " + c1.price + " " + c1.isAutomatic); //Audi null 50 false

		System.out.println(c4.name + " " +c4.color + " " + c4.price + " " + c4.isAutomatic); //Tesla Black 90 true
	
		double d1 = c1.getCarMilage();
		System.out.println(d1);
	}

}
