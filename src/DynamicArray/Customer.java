package DynamicArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Customer {

	public static void main(String[] args) {

		List<String> nameList = new ArrayList<String>();

		nameList.add("Tom"); // 0
		nameList.add("Peter"); // 1
		nameList.add("Rashmi");// 2
		nameList.add("Ravi"); // 3
		nameList.add("Naveen"); // 4

		System.out.println(nameList.size()); // 5

//		// 1. print in reverse arrayList: use this for interview
//		for(int i=nameList.size()-1; i>=0; i--) {
//			System.out.println(nameList.get(i));
//		}

		System.out.println(nameList); // [Tom, Peter, Rashmi, Ravi, Naveen]

		// 2. reverse ArrayList using Collections without using forloop:
		Collections.reverse(nameList);
		System.out.println(nameList); // [Naveen, Ravi, Rashmi, Peter, Tom]

		// sort the arrayList:
		Collections.sort(nameList);
		System.out.println(nameList); // [Naveen, Peter, Rashmi, Ravi, Tom]

		// swap the values:
		Collections.swap(nameList, 2, 4);
		System.out.println(nameList); // [Naveen, Peter, Tom, Ravi, Rashmi]

		// replace value:
//		Collections.replaceAll(nameList, "Tom", "Meenakshi");
//		System.out.println(nameList);   //[Naveen, Peter, Meenakshi, Ravi, Rashmi]

		nameList.add("Amritha");
		System.out.println(nameList); // [Naveen, Peter, Tom, Ravi, Rashmi, Amritha]

		nameList.add(0, "Kath");
		System.out.println(nameList); // [Kath, Naveen, Peter, Tom, Ravi, Rashmi, Amritha]

		nameList.remove(1);
		System.out.println(nameList.get(1)); // peter
		System.out.println(nameList); // [Kath, Peter, Tom, Ravi, Rashmi, Amritha]

	}

}
