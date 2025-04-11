package Java8Stream.FlatMapDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatMapDemo1 {

	public static void main(String[] args) {
		
		//map()
	    List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> list2 = list1.stream().map(n->n+10).collect(Collectors.toList());	
        System.out.println(list2);
        
        //flatMap()
	    List<Integer> lst1 = Arrays.asList(1,2);
	    List<Integer> lst2 = Arrays.asList(3,4);
	    List<Integer> lst3 = Arrays.asList(5,6);
	    List<Integer> lst4 = Arrays.asList(7,8);
	    
	   List< List<Integer>> finalList = Arrays.asList(lst1, lst2, lst3, lst4);
	   
	   List<Integer> finalResults = finalList.stream().flatMap(x->x.stream()).collect(Collectors.toList());
	   //flatMap() => take one collection and add that collection into the stream
	   System.out.println(finalResults);
	   
	   
	   //doing some operation on the list
	   List<Integer> finalAddedResults =  finalList.stream().flatMap(x->x.stream().map(n->n+20)).collect(Collectors.toList());
	   System.out.println(finalAddedResults);
	   
	   
	   System.out.println("-----------------------");
	   
	   List<String> teamA = Arrays.asList("Scott", "David", "John");
	   List<String> teamB = Arrays.asList("Mary", "Luna", "Tom");
	   List<String> teamC = Arrays.asList("Ken", "Jony", "Kitty");
	   
	   List<List<String>> playersInWorldCup = new ArrayList<List<String>>();
	   playersInWorldCup.add(teamA);
	   playersInWorldCup.add(teamB);
	   playersInWorldCup.add(teamC);
	   
	   //before java 8 
/*	   for(List<String> team : playersInWorldCup) {
		   for(String name : team) {
			   System.out.println(name);
		   }
	   }
	   
*/	   
	   // using stream flatMap()
	  List<String> names =  playersInWorldCup.stream().flatMap(pList->pList.stream()).collect(Collectors.toList());
	  //flatmap => take a one collection at a time and create stream finally it return stream of object
      System.out.println(names);
      
      
        
	}

}
