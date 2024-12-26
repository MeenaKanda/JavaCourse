package VectorConcepts;

import java.util.Vector;

public class Vector2DConcepts {

	public static void main(String[] args) {
		
		
		Vector<String> langVector = new Vector<>();
		langVector.add("Java");
		langVector.add("Python");
		langVector.add("Ruby");
		langVector.add("JavaScript");
		langVector.add("C#");
		
		Vector osVector = new Vector();  //raw type
		osVector.add(osVector);  //0
		
//	    System.out.println(osVector);
		
		//2d vector::
		
		for(int i=0; i<langVector.size(); i++) {
			String str = (String)((Vector) osVector.get(0)).get(i);
			System.out.println(str);
	}
		
	}

}
