package AssignmentPractice;

import java.util.Arrays;

public class Practice3 {
	
//	
//	public void addTwoNum() {
//		int a= 10;
//		int b = 20;
//		int total = a+b;
//		System.out.println(total);
//	}
//	
//	public void addTwoNum(int a, int b) {
//		System.out.println(a+b);
//	}
//	
//	public String addTwoNum(double a,String b) {
//		System.out.println(a+b);
//		return a+b;
//	}
//	
//	public String addTwoNum(int a, int b,String c) {
//		System.out.println(a*b+c);
//		return "success";
//	}
	
//	public static void main(int a) {
//		System.out.println("value of 1 parm main : " + a);
//	}
//	public int main(int a , int b) {
//		System.out.println(a+b);
//		return a+b;
//	}
          
 //    String empName[] = {"Meena","Kanda","Balu","Sammu","Balu","Meena","Sammu"};
	
 
	
	
	public static void main(String[] args) {
		String empName[] = {"Meena","Kanda","Balu","Sammu","Balu","Meena","Balu","Meena"};
		
		Practice3 e1 = new Practice3();
		
 //       System.out.println(e1.empName[3]);
		System.out.println(empName[4]);
		System.out.println(empName.length);
		System.out.println(empName.length - 1);
		
		System.out.println(Arrays.toString(empName));
		
		int count = 0;
		for(int i=0; i<empName.length; i++) {
			System.out.println(empName[i]);
			
			if(empName[i].equals("Meena")) {
				
				System.out.println(empName[i] + ": is QA");
				count++;
				}
	             
		}
		 System.out.println( count);
		 
		 System.out.println("_-----------------------");
		 int ct = 0;
		 for(String e : empName) {
			 System.out.println(e);
			 
			 if(e.equals("Meena")) {
				 System.out.println("hi");
				 ct++;
			 }
		 }System.out.println(ct);
		 
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		Practice3 a1 = new Practice3();
//		int b1 = a1.main(20, 50);
//		System.out.println("-----------------");
//		System.out.println(b1);
//		String b2 = "kanda";
//	//	String  sum = b1 + b2;
//	//	System.out.println(sum);
//		System.out.println(b1+b2);
//		
//		Practice3.main(b1);
		
		
//
//          Practice3 a1 = new Practice3();
//          
//          a1.addTwoNum();
//         
//          a1.addTwoNum(15, 43);
//         System.out.println("----------------");
//          String t1 = a1.addTwoNum(12.5, "Meena");
//    //      System.out.println(a1.addTwoNum(12.5, 10));
//          System.out.println(t1);
//          System.out.println(t1+100);
//          
//         
//          a1.addTwoNum(100, 2, "Balu");
//          
//          String s1 = a1.addTwoNum(100, 2, "Balu");
//          System.out.println(s1);

	}

}
