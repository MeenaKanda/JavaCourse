package LamdaExpression;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class empl{
	String eName;
	int salary;

	public empl(String eName, int salary) {
		this.eName = eName;
		this.salary = salary;
	}
	
	
}



public class functionDemo2 {

	public static void main(String[] args) {
		
    ArrayList<empl> empList = new ArrayList<empl>();
    empList.add(new empl("David", 50000));
    empList.add(new empl("John", 30000));
    empList.add(new empl("Mary", 20000));
    empList.add(new empl("Ashley", 33000));
    
    Function<empl, Integer> fn = e->{
    	        int sal = e.salary;
    	        if(sal>=10000 && sal<=20000)
    	        	return (sal*10/100);
    	        else if(sal>20000 && sal<=30000)
    	        	return (sal*20/100);
    	        else if(sal>30000 && sal<=50000)
    	        	return (sal*30/100);
    	        else
    	            return (sal*40/100);
                };
                
    Predicate<Integer> p = b->b>8000;
    
                
     for(empl emp : empList) {
    	 int bonus = fn.apply(emp);
    	 if(p.test(bonus)) {
    	 System.out.println(emp.eName + "  " + emp.salary);
    	 System.out.println("Bonus is = " + bonus);
     }
     }
	}

}
