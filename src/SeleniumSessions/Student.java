package SeleniumSessions;

public class Student {
	
	//WAF:
	//give the studentName(String) as a parameter
	//return the student marks(int)
	
	public int getStudentMarks(String studentName) {
		System.out.println("getting student marks for : " + studentName);
		
//		if(studentName.equals("Neha")) {
//			return 100;
//		}
//		else if(studentName.equals("Somesh")) {
//			return 90;
//		}
//		else if(studentName.equals("Amir")) {
//			return 80;
//		}
//		else {
//			System.out.println("student is not found");
//			return -1;  //always return negative number
//		}
	//always return only one return at a time	
	
		
	 	switch (studentName) {
		case "Neha":
			return 100;
		case "Somesh":
			return 90;
		case "Amir":
			return 80;
			

		default:
			return -1;
		}
		
	}	
	
	public int test(int a, int b, String y) {  //no use of parameters
		System.out.println("hi");
		int total = a+b;
		if(y==null) {
			System.out.println("I got null");
		}
		return total;
	}
	 	

	public static void main(String[] args) {
		
		Student st = new  Student();
		int m1 = st.getStudentMarks("Somesh");  //call by value
		System.out.println(m1);
		if(m1 == -1) {
			System.out.println("no need to print marksheet");
		}
		else {
			System.out.println("print the marksheet");
		}
		
		int s1 =st.test(10, 20, null);
		System.out.println(s1);

	}

}
