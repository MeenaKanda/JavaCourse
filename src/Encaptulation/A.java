package Encaptulation;

public class A {
	
	
	public void t1() {  // calling main method in B from normal method t1()
		
		String s[] = {"Meena"};
		A.main(s);
	}
	

	public static void main(String[] args) {
	
		A a = new A();
		a.t1();
		
		B.main(args);  //call main method from class B
		
	}
	

}
   