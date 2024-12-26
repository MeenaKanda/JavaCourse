package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {
	
		ArrayList<String> studentList = new ArrayList<String>();
		
		studentList.add("Tom");
		studentList.add("Sammu");
		studentList.add("Meena");
		studentList.add("Kanda");
		studentList.add("Tanish");
		
		//typical for loop::
		for(int i=0; i<studentList.size(); i++) {
			System.out.println(studentList.get(i));
		}
		
		System.out.println("------------------");
		
		//for each loop::
		for(String e : studentList) {
			System.out.println(e);
		}
		
		System.out.println("------------------");
		
		//JDK 8 - streams with Lambda:::
		studentList.stream().forEach(ele ->System.out.println(ele));
		
		
		System.out.println("------------------");
		
		
		//Iterator => is an interface which is used to iterate the values from the collections
		
		//Iterator:::
		
		Iterator<String> it = studentList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("------------****************-------------");
		
		//listIterator::
		ListIterator<String> lit = studentList.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		
		System.out.println("-----------previous---------------");

		ListIterator<String> lstit = studentList.listIterator();
		while(lstit.hasPrevious()) {
			System.out.println(lstit.previous());
		}
		
	}

}
