package AssignmentPractice;

import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {
		
		int i[] = new int[4];
//		System.out.println(i[0]);
//	    System.out.println(i[4]);
			
		
		i[0]= 10;
		i[1]= 20;
		i[2]= 30;
		i[3] = 40;
		
		for(int j=0; j<=i.length-1; j++) {
			System.out.println(i[j]);
		}
		
		System.out.println("----------------------");
		char k[] = new char[5];
		System.out.println(k.length);  //5
		k[0] = 'A';
		k[1] = 'B';
		k[2] = 'C';
		k[3] = 'A';
		k[4] = 'A';
		
		int count = 0;
		for(char c : k) {
	//		System.out.println(c);
			if(c == 'A') {
	//			System.out.println("letter :" + c);
				count++;
			}
			}
		System.out.println("occurance of A : " + count);
		
		System.out.println("----------------------");
		
		String s[] = {"Java", "PytHoN  ", "JavaScript", "  DOTNET"," PYtHon", "DotNet  ", "DotNet"};
		System.out.println(s.length);
		
		int count1 = 0;
		int count2 = 0;
		for(String e : s) {
	//		System.out.println(e);
			if(e.trim().equalsIgnoreCase("DoTnET")) {
	//			System.out.println("word Dot : " + e);
				count1++;
				
			}else if(e.trim().equalsIgnoreCase("PYtHOn")) {
	//			System.out.println("word pyt: " + e);
				count2++;
			}
		}
		System.out.println("occurence of DotNet : " + count1);  //3
		System.out.println("occurence of Python : " + count2);  //2
		
		System.out.println(Arrays.toString(s));   //[Java, PytHoN  , JavaScript,   DOTNET,  PYtHon, DotNet  , DotNet]
		
		System.out.println("*************************");
		
		Object o[] = {"Meena", 36, "brown", 'F', true, 70000f};
		for(Object obj : o) {
			System.out.println(obj);
			if(obj.equals(true)) {
				System.out.println("Meena is a QA");
			}
		}
		System.out.println(Arrays.toString(o));  //[Meena, 36, brown, F, true, 70000]
		System.out.println(o[0]);
		System.out.println(o[1]);
		System.out.println(o[2]);
		System.out.println(o[3]);

	}

}
