package NaveenClassHW;

import java.util.Arrays;

public class video9ClassObject {

	String name;
	int age;
	String city;
	
	
	
	public static void main(String[] args) {
		
		video9ClassObject u1 = new video9ClassObject();
		u1.name = "Meena";
		u1.age = 25;
		u1.city = "WA";
		
		video9ClassObject u2 = new video9ClassObject();
		u2.name = "Balu";
		u2.age = 20;
		u2.city = "WA";
		
		video9ClassObject u3 = new video9ClassObject();
		u3.name = "Sammu";
		u3.age = 12;
		u3.city = "WA";
		
		video9ClassObject u4 = new video9ClassObject();
		u4.name = "Tanish";
		u4.age = 7;
		u4.city = "WA";

		System.out.println(u1.name); //Meena
		System.out.println(u2.name); //Balu
		System.out.println(u3.name); //Sammu
		System.out.println(u4.name); //Tanish
		
		System.out.println("--------------");
		
		u1 = u2;
		System.out.println(u1.name); //Balu
		System.out.println(u2.name); //Balu
		System.out.println(u3.name); //Sammu
		System.out.println(u4.name); //Tanish
		
		System.out.println("---------------");
		
		u2 = u3;
		System.out.println(u1.name); //Balu
		System.out.println(u2.name); //Sammu
		System.out.println(u3.name); //Sammu
		System.out.println(u4.name); //Tanish
		
		System.out.println("----------------");
		
		u3 = u4;
		System.out.println(u1.name);  //Balu
		System.out.println(u2.name);  //Sammu
		System.out.println(u3.name);  //Tanish
		System.out.println(u4.name);  //Tanish
		
		System.out.println("------------------");
		
		u4 = u1;
		System.out.println(u1.name);  //Balu
		System.out.println(u2.name);  //Sammu
		System.out.println(u3.name);  //Tanish
		System.out.println(u4.name);  //Balu
		
		
		//Occurance of String in Array?
		Object arr[] = {"Meena", "Ravi", "somu", "Ravi", "Ravi"};
		int counter = 0;
		
		for(Object e : arr) {
			if(e.equals("Ravi")) {
				counter++;
			}
		}
		System.out.println(counter);
			
		System.out.println("*****************************");
		
		
		
		int arr1[]=new int[] {0,100,20};
		System.out.println(arr1.length);
		System.out.println(Arrays.toString(arr1));  //[0, 100, 20]

//		 int index=0;//can include a index
//
//		 for(int a : arr1){
//
//		 System.out.println( index + ": " +a);
//
//		 index++;
//		}
          for(int m=0; m<arr1.length; m++) {
        	  System.out.println(arr1[m]);
		 
          }
	
	}
}
