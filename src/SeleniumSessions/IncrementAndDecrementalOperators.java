package SeleniumSessions;

public class IncrementAndDecrementalOperators {

	public static void main(String[] args) {
		
		//1. post increment: ++ increase the value by 1
		// execution happen left to right
		
		int a = 1;
		int b = a++;  //first value of a will be given to b(b=1). then increase the value of a by 1(a=2)
		System.out.println(a); //2
		System.out.println(b); //1
		
		int c = -99;
		int d = c++;
		System.out.println(c); //-98
		System.out.println(d); //-99
		
		int x = 10;
		int y = x++;
		System.out.println(x); //11
		System.out.println(y); //10
		
		//2. pre increment: ++
		int t = 1;
		int u = ++t; //first increase the value of t by 1(t=2) then give the value of t to u
		System.out.println(t); //2
		System.out.println(u); //2
		
		int k = -99;
		int p = ++k;
		System.out.println(k); //-98
		System.out.println(p); //-98
		
		int g = -1001;
		int h =  ++g;
		System.out.println(g); //-1000
		System.out.println(h); //-1000
		
		//3. post decrement: --
		int s = 2;
		int v = s--;
		System.out.println(s); //1
		System.out.println(v); //2
		
		int l1 = -999;
		int l2 = l1--;
		System.out.println(l1); //-999-1=-1000
		System.out.println(l2); // -999

		
		//4. pre decrement:
		int r1 = 2;
		int r2 = --r1;
		System.out.println(r1); //1
		System.out.println(r2); //1
		
		//----------------------------------//
		int num = 10;
		System.out.println(num++); //10 //original num(10) will be given to println first. then increase value by 1
		System.out.println(num); //11
		
		int total = 10;
		System.out.println(++total); //11 increase value by 1 first then give it to println
		System.out.println(total);  //11
		
        //---------------------------------//
		
		//pre and post increment and decrement can be done for float also
		float f = 2.5f;
		float j = f++;
	
		System.out.println(f);  //3.5
		System.out.println(j);  //2.5
		
		// ++ , -- can be used for char also
		char ch = 'a'; //97
		//System.out.println(++ch); //b  //++ is not a mathemetical operator
		
		System.out.println((int)++ch); //98
		
		//0-9: 48 to 57
		char th = '1';  //49
		//System.out.println(++th);  //2
		System.out.println(th);  //2
		System.out.println((int)++th); //50
		System.out.println((int)th); //50
		
		//
		int pop = 1;
		pop = pop+1; //simple arithmetic operation
		System.out.println(pop); //2
		
		System.out.println(true); //true
		
		
		int p11 = pop+1; 
		System.out.println(p11);  //3
		
		byte f1 = 50;
		byte f2 = 60;
		
		//byte f3 = f1+f2;  //wrong // java don't allow it because of byte
		// when you add two byte numbers , java always give int. store with integer or long.
		int f3 = f1+f2;
		System.out.println(f3);  //110
		
		
		//
		char gh = '1';
		System.out.println(gh++); //1
		System.out.println(gh);  //2
				 
		
		char j1 = 'z'; //120
		System.out.println(++j1);  //{   //(123 ASCII value for 121)
		System.out.println((int)++j1); //124
		 
		//found by Meena
		int x1 = 97;
		System.out.println((char)x1); //a
		System.out.println((char)x1++); //a
		System.out.println((char)x1);   //b
		
		 float b1 = 97.0f;
		 System.out.println((char)++b1);
		 
//		 String s1 = "Hello";
//		 System.out.println(++s1); //cannot convert from String to int  //we can not use ++ operator for String
		 
//		 System.out.println(++true); //Invalid argument to operation ++/-- //we can not use ++ operator for boolean
		 
		 System.out.println(2 * 10);  //20
		 System.out.println(-2 * 10); //-20
		 System.out.println(-2 * -10); //20
		 
		
	}
	
	

}
