package AssignmentPractice;

public class Practice5 {
	
	public String name;
	private int age;
	static String comp;
	private int salary;
	

//	public Practice5(String name, int age, String comp, int salary) {
//		this.name = name;
//		this.age = age;
//		this.comp = comp;
//		this.salary = salary;
//	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
   
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setComp(String comp) {
		this.comp = comp;
	}

	public String getComp() {
		return comp;
	}


	public int getSalary() {
		return salary;
	}

    public void setSalary(int salary) {
		this.salary = salary;
	}



    public void publicmethodA() {
    	System.out.println("publicmethod A");
    	methodB();
    	methodC();
    	methodD();
    	methodE();
    }
    private void methodB() {
    	System.out.println("method B");
    }
    private void methodC() {
    	System.out.println("method C");
    }
    private void methodD() {
    	System.out.println("method D");
    }
    private void methodE() {
    	System.out.println("method E");
    }



	public static void main(String[] args) {
//		
//           Practice5 p1 = new Practice5();
//           System.out.println(p1.name);
//           p1.name = "Ram";
//           System.out.println(p1.name);
//		
	}

}
