package AssignmentPractice;

public class Practice4 {
	
	String emp;
	int age;
	String comp;
	int sal;
    static int idno;	
	
	
	public Practice4(String emp, int age) {
		this.emp = emp;
		this.age = age;
	}
	
	public Practice4(String emp, String comp, int sal) {
		this.emp = emp;
		this.comp = comp;
		this.sal = sal;
	}
	
	public Practice4(String emp, int age, int sal) {
		this.emp = emp;
		this.age = age;
		this.sal = sal;
	}
	

	public Practice4(String emp, int age, String comp, int sal) {
		this.emp = emp;
		this.age = age;
		this.comp = comp;
		this.sal = sal;
	}
	
	

	public static void main(String[] args) {
		
		Practice4 e1 = new Practice4("Ram",35);
		System.out.println(e1.emp);
		System.out.println(e1.age);
		System.out.println(e1.sal);
		System.out.println(Practice4.idno);
		
		 idno = 348;
		System.out.println(Practice4.idno);
		
		System.out.println("************************");
		
		Practice4 e4 = new Practice4("somu",45,"infy",idno);
		System.out.println(e4.emp);
		System.out.println(e4.age);
		System.out.println(e4.comp);
		System.out.println(Practice4.idno);
		
		
	 }
		
		
		
		

	}


