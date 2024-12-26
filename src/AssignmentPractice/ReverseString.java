package AssignmentPractice;

public class ReverseString {
	
	
	static String reverseString(String name) {
		
		
		if (name == null)
		{
			System.out.println("null is not allowed");
			return null;
		}
		
		int len = name.length();
		String rev = "";
		
		if(len == 1) {
			return name;
		}
		
		
		for(int i = len-1; i>=0; i--) {
			rev = rev + name.charAt(i);
		}
//		System.out.println(rev);
		return rev;
	
	} 

	public static void main(String[] args) {
		
		String s = reverseString(null);
		System.out.println(s);
		
		//question ?
		StringBuffer  sb = new StringBuffer("I like Java");
	//	StringBuffer st =sb.reverse();
	//	System.out.println(st);  //avaJ ekil I
		System.out.println("-------------");
		System.out.println(sb.reverse()); // avaJ ekil I
		System.out.println(sb.append(" and Selenium")); //avaJ ekil I and Selenium
	}

}
