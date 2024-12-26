package AssignmentPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HWArrayList {

	public static void main(String[] args) {
		
		 /*1. Write a Java program to create a new array list add some colors (string) and print out the collection*/

		List<String> colors = new ArrayList<String>();
		
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Purple");
		colors.add("Orange");
		
		System.out.println(colors);  //[Red, Blue, Green, Purple, Orange]
		
		for(String e : colors) {
			System.out.println(e);
		}
		
		System.out.println("-------- 2 -----------");
		/* 2. Write a Java program to insert
         *  an element into the array list at the first and last positions.*/
		
		colors.add(0, "Gray");
		colors.add(colors.size(),"Black" );
		System.out.println(colors);  //[Gray, Red, Blue, Green, Purple, Orange, Black]
		
		
		System.out.println("-------- 3 -----------");
		 /* 3. Write a Java program to retrieve an element
          * (at a specified index) from a given array list. */
		
		System.out.println(colors.get(2));  //Blue
		System.out.println(colors.get(colors.size()-1)); //Black
		
		
		System.out.println("-------- 4 -----------");
		/* 4. Write a Java program to update specific array element by given element.*/
		
//		Collections.replaceAll(colors, "Black", "White");
//		System.out.println(colors);
		
		colors.set(6, "White");
		colors.set(2, "yellow");
		System.out.println(colors); //[Gray, Red, yellow, Green, Purple, Orange, White]
		
		System.out.println("-------- 5 -----------");
		/* 5. Write a Java program to remove the third  element from a array list. */
		
		colors.remove(3);
		System.out.println(colors); //[Gray, Red, yellow, Purple, Orange, White
		colors.remove("Gray");
		System.out.println(colors);  //[Red, yellow, Purple, Orange, White]
		
		
		System.out.println("-------- 6 -----------");
		 /* 6. Write a Java program to search an element in a array list.*/
		
		if(colors.contains("Orange")) {
			System.out.println("contains orange");  //contains orange
			}
		else {
			System.out.println(" no orange");
		}
		
		System.out.println("-------- 7 -----------");
		 /* 7. Write a Java program to reverse elements in a array list */
		
		for(int i=colors.size()-1; i>=0; i--) {
			System.out.println(colors.get(i));
		}
		
		Collections.reverse(colors);
		System.out.println(colors);  //[White, Orange, Purple, yellow, Red]
		
		
		System.out.println("-------- 8 -----------");
		/* 8. Write a Java program to extract a portion of a array list*/
		
		List<String> subColors = colors.subList(1, 4);
		System.out.println(subColors);  //[Orange, Purple, yellow]
		
		
		System.out.println("-------- 9 -----------");
		/*  9. Write a Java program of swap two elements in an array list*/
		Collections.swap(colors, 1, 3);
		System.out.println(colors);  //[White, yellow, Purple, Orange, Red]
		
		System.out.println("-------- 10 -----------");
		 /* 10. Write a Java program to empty an array list.*/
//		colors.removeAll(subColors);
//		System.out.println(colors); // [White, Red]
		
//		colors.removeAll(colors);
//		System.out.println(colors); //[]
		
		
		System.out.println("-------- 11 -----------");
		/* 11. Write a Java program to trim the virtual capacity of an
         *  array list the current list size.*/
		
		
		System.out.println("-------- 12 -----------");
		/* 12. Write a Java program to print all the element
		*  ArrayList using the position of the elements */
		
		
	}
	

}
