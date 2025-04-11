package Java8Stream.filterDemos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterDemo3 {

	public static void main(String[] args) {
		
		//Remove null from the collection
		
		List<String> words = Arrays.asList("cup", null, "forest", "sky", null, "pencile");
		
		List<String> result = words.stream().filter(w->w != null).collect(Collectors.toList());
        System.out.println(result);
	
	}

}
