package ExceptionHandling;

public class Student {

	public static int getMarks(String name) {
		System.out.println("getting marks for : " + name);
	
	
	if(name.equals("Rashmi")) {
		
		try{
			int i = 9/0;
		}
		catch(ArithmeticException e){
			System.out.println("AE is coming....");
			return 85;
		}
		finally {  
			System.out.println("print mark sheet");
			return 70;    //preference ->always finally block return executed.it override the catch return.(when handle exception by catch) 
		}
//		return 90;  // can not write this when finally block have return

	}
	
	else if(name.equals("Tom")) {
		return 95;
	}
	
	else if(name.equals("Ravi")) {
		return 70;
	}
	
	else {
		System.out.println("Student not found");
		return -1;
	}
	}
	
	public static void main(String[] args) {
		
		int m1 =getMarks("Rashmi");
		System.out.println(m1);
		

	}

}
