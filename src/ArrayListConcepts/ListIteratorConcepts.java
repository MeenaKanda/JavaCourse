package ArrayListConcepts;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorConcepts {

	public static void main(String[] args) {
	
		ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("orange");
        list.add("strawberry");
        list.add("avacado");
        
        ListIterator<String> listIt =  list.listIterator();
        while(listIt.hasNext()) {
        	String e = listIt.next();
        	int index = (listIt.nextIndex()-1);
        	System.out.println("index of the " + e + " is = " + index);
        }
        // backward traversing using listIterator::
        ListIterator<String> backwardIt =  list.listIterator(list.size());
        while(backwardIt.hasPrevious()) {
        	System.out.println(backwardIt.previous());
        }
        
        System.out.println("***************backward index ***********************");
        
        //finding index of backward traversing::
        ListIterator <String> backwardIndex =  list.listIterator(list.size());
        while(backwardIndex.hasPrevious()) {
        	String str = backwardIndex.previous();
         	int index = backwardIndex.nextIndex();  //or
   //     	int index =backwardIndex.previousIndex()+1;
        	System.out.println("index of the backware " + str + " is = " + index);
        }
        
        System.out.println(" ********  find the specific index of an element using listIterator ************ ");
        
        //find the specific index of an element using 
		
        String targetElement = "apple";
        int index = 0;
        int targetIndex = -1;
        
        ListIterator<String> it = list.listIterator();
        while(it.hasNext()) {
        	String element = it.next();
        	if(element.equals(targetElement)) {
        	 targetIndex = index;
        	 break;
        	}
        	index++;
        	
        }
        if(targetIndex != -1) {
        	System.out.println("target " + targetElement + " index number = " + index);
        }
        
        else {
        	System.out.println("target element is not present in this array");
        }
	}

}
