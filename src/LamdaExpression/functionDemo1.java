package LamdaExpression;

import java.util.function.Function;

public class functionDemo1 {

	public static void main(String[] args) {
		
		//1.
		Function<Integer, Integer> f = n->n*n;
		
		System.out.println(f.apply(5));
		System.out.println(f.apply(10));
		System.out.println(f.apply(20));
		
		//2. String --> length --> Int
		Function<String, Integer> fn = s->s.length();
		System.out.println(fn.apply("Welcome"));
		System.out.println(fn.apply("Java Programming"));

	}

}
