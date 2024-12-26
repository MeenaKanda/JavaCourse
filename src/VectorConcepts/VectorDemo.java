package VectorConcepts;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<Integer> myVector = new Vector<>();		
		myVector.add(2);
		myVector.add(4);
		myVector.add(6);
		myVector.add(8);
		myVector.add(10);
		myVector.add(12);
		myVector.add(14);
		
		System.out.println(myVector);
		
		System.out.println(myVector.get(2));
		
		myVector.remove(3);
		System.out.println(myVector);
		
		Vector<Integer> yourVector = new Vector<>();
		yourVector.add(10);
		yourVector.add(15);
		
		System.out.println(yourVector); //[10, 15]
		
		myVector.addAll(yourVector);
		System.out.println(myVector); //[2, 4, 6, 10, 12, 14, 10, 15]
		
		//for-each loop
		for(Integer e : myVector) {
			System.out.println(e);
		}
		
		System.out.println("====================");
		
		//for loop:
		for(int i=0; i<myVector.size(); i++) {
			System.out.println(myVector.get(i));
		}
		
		System.out.println("====================");
		
		
		//iterator:
		Iterator<Integer> it = myVector.iterator();
		while(it.hasNext()) {
			System.err.println(it.next());
		}
		
		
		
		System.out.println("====================");
		
		//sort
		Collections.sort(myVector);
		System.out.println(myVector);
		
	}

}
