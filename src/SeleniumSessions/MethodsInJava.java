package SeleniumSessions;

public class MethodsInJava {
	
	//Java has 2 class members: we have to create the object to access the data members
	// 1. class variables
	// 2. class methods.
	
	
	//function: is a piece of program which is written within some body. we can execute the program any time.
	//functions are independent.
	//cannot create a function inside a function.
	//2+2 = 4
	//3+2 = 5
	
	// 3 types of function/method:
	//1. no input and no return:
	//void: no return: function can not return anything
	//return type: void
	public void test() {
		System.out.println("test method");
		int a = 10;
		int b = 15;
		System.out.println(a+b);
	}
	
	//2. no input and some return:
	//return type : int
	public int getBillAmount() {  
		System.out.println("get billling amount");
		int foodBills = 100;
		int drinkBills = 50;
		int totalAmount = foodBills + drinkBills;
		return totalAmount;
		}
	
	public String getEmployeeName() {
		System.out.println("get emp name");
		
		String name = "Naveen";
		return name;
	}
	
	public String getName() {
		System.out.println("get name");
		return "selenium";
	}
	
	public int getNumber() {
		System.out.println("get number");
		return 100;
	}
	
	public boolean isElementExist() {
		System.out.println("check element is present");
		boolean flag = true;
		return flag; 
	}
	
	public int getMarks() {
		int a = 100;
		int bonus = 5;
		int negative = 10;
		int finalMarks = a + bonus - negative;
		//return 0;  // no sense writing this 0
		//return 400; // how 400 linked with finalmarks?.no sense.so write appropriate 
		return finalMarks;
	}
	
	
	// 3. some input and some return:
	//WAF:
	//two variable: a and b
	//return sum of these two numbers:
	public int getSum(int a, int b) {  
		System.out.println("sum of two numbers");
		int sum = a+b;
		return sum;
	}
	
	
	//WAF:
	//input parameter : int, double
	//return multiplication of these two numbrs
	public double  getMultiplication(int x, double y) {
		System.out.println("getMultiplication");
		double mul = x * y;
		return mul;
	}

	
	public String getEmpSalary(String empName, int bonusAmount) {
		System.out.println("emp salary");
		
		return empName + " " + bonusAmount;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		//call the function: we have to create the object
		MethodsInJava obj = new MethodsInJava();
		obj.test();  
		
		int m1 = obj.getBillAmount(); //return type is int.
		// this m1 can be used for some other purpose later on(discount,coupon,offer) - adv of return type
		System.out.println(m1);   
		System.out.println(m1-10);  
		
		//directly printing without store in variable. this is also give same. but this is not right way of calling method
		System.out.println(obj.getBillAmount());
		
		String emp = obj.getEmployeeName();
		System.out.println(emp);
		
		if(obj.isElementExist()) {
			System.out.println("click on element");
			}
		
		//call by value: calling the function by passing some value 
		int s1 = obj.getSum(10, 20);  
		System.out.println(s1);  //30
		
		int s2 = obj.getSum(40, 50);
		System.out.println(s2);  //90
		
		
		double mul1 = obj.getMultiplication(10, 2.2);
		System.out.println(mul1);  //22.0

		String empInfo = obj.getEmpSalary("Amit", 20);
		System.out.println(empInfo);
		
	}

}
