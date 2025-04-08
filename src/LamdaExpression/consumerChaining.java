package LamdaExpression;

import java.util.function.Consumer;

public class consumerChaining {

	public static void main(String[] args) {
	
		//Consumer Chaining::
		
		Consumer<String> c1 = s->System.out.println(s + " " + "is White");
		Consumer<String> c2 = s->System.out.println(s + " " + "is having 4 legs");
		Consumer<String> c3 = s->System.out.println(s + " " + "is eating grass");

		//1.
		/*
		c1.accept("Cow");
		c2.accept("Cow");
		c3.accept("Cow");
		*/
		
		//2.
//		c1.andThen(c2).andThen(c3).accept("Cow");
		
		
		//3.
		Consumer<String> c4 = c1.andThen(c2).andThen(c3);
		c4.accept("Cow");
		
		
		
	}

}
