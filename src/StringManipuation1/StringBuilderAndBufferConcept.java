package StringManipuation1;

public class StringBuilderAndBufferConcept {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("selenium"); // mutable obj

		// StringBuilder s1 = "Naveen"; // StringBuilder with literals not allowed.//allowed only for String

		sb.append("testing");
		System.out.println(sb); //seleniumtesting  //sb updated from "selenium" to "selenium testing" . so string builder is mutable.

		String s1 = "cypress";   //immutable 
		s1.concat("ui testing");  //"cypress ui testing" created in SCP
		System.out.println(s1);  //cypress   //s1 is still "cypress" not updated. so string is immutable.
	}

}
