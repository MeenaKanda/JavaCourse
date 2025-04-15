package Java8Stream.FlatMapDemos;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamStringArrayWithFlatMap {

	public static void main(String[] args) {
		
		String data[][] = new String[][] {
			{"a", "b"},
			{"c", "d"},
			{"e", "f"}
		    };
		    
		    
	    Stream<String[]> dataStream= Arrays.stream(data);
	    //apply faltmap on dataStream
	   Stream<String> streamFlatMap =  dataStream.flatMap(x->Arrays.stream(x));
	// Stream<String> dataStreamFilter = streamFlatMap.filter(x-> "a".equals(x));  //or
	   Stream<String> dataStreamFilter = streamFlatMap.filter(x-> "a".equals(x.toString()));

	   dataStreamFilter.forEach(System.out::println);
	
	
	//2.
	   
  Stream<String> finalStream = 	Arrays.stream(data)
	                                      .flatMap(x-> Arrays.stream(x))
	                                       .filter(x -> x.equals("f"));
	
   finalStream.forEach(System.out::println);
	
	}

}
