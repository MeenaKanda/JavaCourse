package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {
	
	
	// contains()
    //containsAll()
    //indexOf
	//add()
	//addAll()
	//get()
	//lastIndexOf()
	//clear() => clear all values
	//remove(index)
	//remove(value)
	//removeIf(condition)
	//removeAll()
    //retainAll(Collectons.singleton("tom")
	//subList(index, index)
	// toArray() => convert into static Array
	
	public static void main(String[] args) {
	
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("java");
		ar1.add("python");
		ar1.add("ruby");
		ar1.add("javascript");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Testing");
		ar2.add("dev ops");
		
    /*	ar1.addAll(ar2);
		
		System.out.println(ar1);  //[java, python, ruby, javascript, Testing, dev ops]

		ar1.addAll(2, ar2);
		
		System.out.println(ar1); //[java, python, Testing, dev ops, ruby, javascript, Testing, dev ops]

//		
		System.out.println(ar2);  //[Testing, dev ops]
		
		ar1.clear();
		System.out.println(ar1 );//[]
*/
		
		
		ArrayList<String> cloneList = (ArrayList<String>)ar1.clone();
		System.out.println(cloneList);
		
		
		//contains() => return boolean
		
		System.out.println(ar1.contains("python")); //true
		System.out.println(ar1.contains("c"));  //false
		
		System.out.println(ar1.indexOf("ruby"));  //2
		
		System.out.println(ar1.indexOf("ruby") > 0);
		
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("Naveen", "peter","Naveen", "steve", "tom","Naveen"));
		System.out.println(list1);
		
		int i= list1.lastIndexOf("Naveen");
		System.out.println(i);  //5
		
		int j= list1.lastIndexOf("Test");  // if it is not available it return -1
		System.out.println(j);  // -1
		
		list1.remove(1);    // based on inded
		System.out.println(list1);  //peter removed //[Naveen, Naveen, steve, tom, Naveen]
		
		list1.remove("steve");  //based on value
		System.out.println(list1);  //[Naveen, Naveen, tom, Naveen]
		
		
		//given a list and remove all those even numbers and print only odd number
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		numbers.removeIf(num -> num%2 == 0);  //inside removeIf we need to give one condition(predicit) that return boolen // -> lamda arrow
		System.out.println(numbers); //[1, 3, 5, 7, 9]  //removed all those even number
		
		//given a list and remove all those odd numbers and print only enve number
		
		ArrayList<Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		numbers1.removeIf(num -> num%2 != 0);
		System.out.println(numbers1);  //[2, 4, 6, 8, 10]  // even numbers removed
		
		
		ArrayList<String> nameList = new ArrayList<String>(Arrays.asList("Naveen","Tom", "peter","Lisa", "steve", "Tom"));
       
		nameList.retainAll(Collections.singleton("Tom"));  //give me only those value which is passing inside singleton()
		System.out.println(nameList); //[Tom, Tom]
		
		
		ArrayList<Integer> numbers2 = new ArrayList<Integer>
		                              (Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));
		
		
		
		ArrayList<Integer> subList = new ArrayList<Integer>(numbers2.subList(2, 5));
		System.out.println(subList);  //[3, 4, 5]
		

       //convert into static Array:::  single dimention array
		
		ArrayList<String> newList = new ArrayList<String>(Arrays.asList("Naveen","Tom", "peter","Lisa", "steve", "Tom"));
		
		Object arr[] = newList.toArray();
		System.out.println(Arrays.toString(arr));
		
		for(Object e : arr) {
			System.out.println(e);
	//		System.out.println((String)e);  // want to get pure string value cast String
		}

	}

}
