package AssignmentPractice;

import java.util.Arrays;

public class StringManipulation {

	//  6. Write a program that gives you the last half of the string.
	static String lastHalfOfString(String name) {

		int n = name.length() / 2;
		System.out.println(n);
		String ans = "";
		for (int i = n; i < name.length(); i++) {
			ans = ans + name.charAt(i);
		}
		return ans;
	}

//	3. Write a program that will  print out the last character and first character of a word.
	static void firstLastChar(String name) {

		System.out.println("first charcter of a word : " + name.charAt(0));
		System.out.println("last character of a word : " + name.charAt(name.length() - 1));
	}

	// 8. Write a method which gives an index of (-1) if string is not available. .
	// it should return integer. if String is present, then it should return the
	// specific index.

	static int findIndex(String name) {

		if (name.contains("like")) {
			int index = name.indexOf("like"); 
			// System.out.println(index);
			return index;
		} else {
			return -1;
		}

	}

	// 10. Assume that a string consists of 3 words, print out the middle one. 

	static void findMiddleWordOf3(String name) {

		String arr2[] = name.split(" ");
		System.out.println("length of an string array : " + arr2.length);
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("Word in an string array : " + arr2[i]);
			System.out.println("length of an word in array : " + arr2[i].length());
		}
		if (arr2.length == 3) {
			System.out.println(arr2[1]);
		} else {
			System.out.println("String is not consisting of 3 words");
		}

	}

	public static void main(String[] args) {
		
		//1.  Write a program to check two different strings equality.
		
		String a1 = "    Coding is fun    ";
		String b1 = "coding is fun    ";
		
	//	System.out.println(a1.equals(b1));  //true
		if(a1.trim().equalsIgnoreCase(b1.trim())) {
			System.out.println("both strings are equals");
		}
		else {
			System.out.println("strings are not equal");
		}
		
		
		System.out.println("-------- 2 ----------");
		
		
		
	//	2. Remove all  spaces in a String . 
    //  For example  : “         Hello      Everyone       “ .     Expected result: “HelloEveryone”.
		
		String s = "     Hello      Everyone";
		System.out.println(s.replaceAll(" ", ""));
		System.out.println(s);  // "     Hello      Everyone"  //question?
		
		System.out.println("-------- 3 ---------");
		
	//	3. Write a program that will  print out the last character and first character of a word.
//		
//		String b = "Samriddhi";
//		int len = b.length();
//		System.out.println(len);  //9
//		System.out.println("first character of a word : " + b.charAt(0));
//		System.out.println("last character of a word : " + b.charAt(len-1));
//		
		//calling method:
		firstLastChar("Samriddhi Kandaswamy");
	
		System.out.println("------- 4 -----------");
		
	// 4. Write a program to verify a word or a character contained in the sentence.
		
		String a = "I like Java";
		if(a.contains("like")) {
			System.out.println("word is present in this sentence");
		}
		else {
			System.out.println("not present");
		}
		
		System.out.println("------ 6 ----------");
		
		// 6. Write a program that gives you the last half of the string.
		String s1 =lastHalfOfString("MeenaKanda");
		System.out.println(s1);
		
		System.out.println("-------- 7 ----------");

	//7.Write a program to get the 3rd  “ e “ of the string .
    //For example: “Welcome to Naveen Automation Labs ! “.	
		String s2 = "Welcome to Naveen Automation Labs !";
		int index = s2.indexOf("e");
		int count = 0;
		while(index>=0) {
		//	System.out.println("index of e : " + index);
			index = s2.indexOf("e", index+1);
			count = count + 1;
			if(count == 3) {
				System.out.println("3rd occurence of e : " + index);
			}
		}
      
		System.out.println("-------- 8 ----------");
		
	//8. Write a method which gives an index of (-1) if string is not available. . 
		// it should return integer. if String is present, then it should return the specific index.
		int x =findIndex("I like java and do java programs");
		System.out.println(x);
		
		System.out.println("--------- 9 ---------");
		
	//9. Write a program that breaks a whole string into small strings, and prints out its all values . (Hint: split, loop) .
		String y = "Meena Kanda Sammu Tanish";
		
		String arr[] = y.split(" ");
		System.out.println(Arrays.toString(arr));
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("------------ 10 -----------------");
		
	//10. Assume that a string consists of 3 words, print out the middle one. 
		
//		String z = "I love Mummy and daddy";
//		String arr1[] = z.split(" ");
//		System.out.println(arr1.length);  //3   
//		System.out.println(Arrays.toString(arr1)); //[I, love, Mummy]
//		for(int i = 0; i<arr1.length; i++) {
//			System.out.println(arr1[i]);
//			System.out.println("length of a word : " +arr1[i].length());
//		}
//		
//		if(arr1.length == 3) {
//			System.out.println(arr1[1]);
//		}
//		else {
//			System.out.println("String not consists of 3 words");
//		}
		
		findMiddleWordOf3("I love mummy");
		
		System.out.println("--------------------");
		//11. get only numeric part from this String:
        //String s = "your transaction id is: 12345 and reference id is 34567";
		//To find whether a given string contains a number, convert it to a character array and
		//find whether each character in the array is a digit using the isDigit() method of the Character class.
		
	
//		String st = "your transaction id is: 12345 and reference id is 34567";
//		char charray[] = st.toCharArray();
//		for(char c : charray) {
//			if(c.)
//		}
		String st = "your transaction id is: 12345 and reference is is 34567";
		String num = st.replaceAll("[^0-9]", "");
		System.out.println("numbers are : " + num);
		String alp = st.replaceAll("[^a-z]", "");
		System.out.println("alphabets are : " + alp);
		
	}

}
