package LinkedListConcepts;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		
		// LL is default class in Java.  
		// it implements List,  Queue. so it can be used as List, Stack, Queue
		// ut allows the null entry
		// dynamic collection. it allocates memeory whenever it required.
		//hense insertion and deletion can be easily implemented.
		// it can contain duplicate elements
		// it is not synchronized( not thread safe)
		//in LL, Manipulation is fast compare to array because we dont need any shifting like in array.
		//it contains pointer value it pointing to next node.we can easily add value in between without shifting.
		
		// LL constructor::
		// 1. LinkedList();
		// 2. LinkdedList(Collection c);
		
		
		//methods:
		//add()
		//addAll()
		//add(index)
		//addFirst()
		//addLast()
		//remove(index)
		//removeAll()
		//removeFirstz()
		//removeLast()
		//clear() = it clear everything
		//lang.reversed();
		//lang.descendingIterator();
		//Collections.sort(lang);
		
		
		
		// index starts from 0
		LinkedList<String> names = new LinkedList<>();
		
		System.out.println(names.size());  //PC =0
		
		names.add("Tom");  //index =0
		names.add("Naveen");
		names.add("Meena");
		names.add("Kanda");
		names.add("Peter");
		
		System.out.println(names.size()); // PC=2
		
		System.out.println(names);  //[Tom, Naveen]
		
		System.out.println(names.get(1)); 
		System.out.println(names.get(4));  //IndexOutOfBoundsException
		
		//Iterate:
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		names.add("Sammu");
		System.out.println(names);
		
		names.add(2, "Tanish");
		System.out.println(names); //[Tom, Naveen, Tanish, Meena, Kanda, Peter, Sammu]
		
		
		LinkedList<String> users = new LinkedList<>();
			
		users.add("Trump");  //index =0
		users.add("Biden");
		
		
		names.addAll(users);
		System.out.println(names); //[Tom, Naveen, Tanish, Meena, Kanda, Peter, Sammu, Trump, Biden]
		
		
		names.addFirst("Amma");
		names.addLast("balu");
		System.out.println(names); //[Amma, Tom, Naveen, Tanish, Meena, Kanda, Peter, Sammu, Trump, Biden, balu]
		
		names.remove(2);
		System.out.println(names);
		
		names.removeAll(users);
		System.out.println(names);  //[Amma, Tom, Tanish, Meena, Kanda, Peter, Sammu, balu]
		
//		names.removeAll(names);
//		System.out.println(names); //[]
		
		names.removeFirst();
		System.out.println(names);
		
		names.removeLast();
		System.out.println(names);
		
		names.remove("Peter");
		System.out.println(names);
		
		names.clear();
		System.out.println(names);  //[]
		
		
		
		LinkedList<String> lang = new LinkedList<String>();
		lang.add("Java");
		lang.add("Python");
		lang.add("Ruby");
		lang.add("C++");
		
		System.out.println(lang.size());
		
		//reverse LinkdedList::
		LinkedList<String> reverse = lang.reversed();
		System.out.println(reverse);  //[C++, Ruby, Python, Java]
		
		//reverse/ decending order using iterator:
		Iterator<String> itr = lang.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// for-each loop
		for(String e : lang) {
			System.out.println(e);
		}
		
		System.out.println("------------ for loop ---------------");
		
		for(int i=0; i<lang.size(); i++) {
			System.out.println(lang.get(i));
		}
		
		
		//sort:
		Collections.sort(lang);
		System.out.println(lang); //[C++, Java, Python, Ruby]
		
	}

}
