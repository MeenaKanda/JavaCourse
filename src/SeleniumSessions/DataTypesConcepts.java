package SeleniumSessions;

public class DataTypesConcepts {

	public static void main(String[] args) {

		// data types in java:

		// two types:
		// 1. primitive data types: no need to create object.
		// this types of variable dont need any objects.
		// primitive data types occupy some memory which is pre-defined.
		// Integral:
		// Integer: byte, short, int, long
		// character: char
		// Floating-point: float, double
		// Boolean : boolean(true/false)

		// 2. non primitive data types: this means memory size is not fixed.
		// we need to create an object when create String, Array, Interface

		// 1. byte:
		// size: 1 byte = 8 bits
		// rangeL -128 to 127
		byte b = 10;
		// byte b = 20; duplicate variable are not allowed.
		b = 30;
		byte b1 = 20;
		byte b2 = 40;

		System.out.println(b); // 30
		System.out.println(b1); // 20
		System.out.println(b1 + b2);

		byte b11 = 127;
		byte t1 = 0;
		byte age = 40;

		// 2. short:
		// size: 2 bytes = 16 bits
		// range: -32768 to 32767
		short sh = 500;
		short sh1 = -300;

		System.out.println(sh + sh1);

		// 2. int:
		// size: 4 bytes = 32 bits
		// range: -2147483648 to 2147483647
		int i = 1000000;
		int j = 1; // take 4 bytes memory

		
		int k = 3000;
		byte l = 20;
		System.out.println(k + l); // 3020

		// 4. long:
		// size: 8 bytes = 64 bits
		// range:
		long num = 984769804;
		long n = 999999999999L;
		System.out.println(n); // 999999999999

		long ph = 98973659087l;

		// float:
		// size 4 bytes = 32 bits
		// range: upto 7 digits after decimal
		float n1 = 12.33f; 
		System.out.println(n1);
		float n2 = (float) 23.44; 
		System.out.println(n2);
		float n3 = 100; 
		System.out.println(n3);// 100.0
		float n4 = 1.1f;
		float n5 = 0.9f;

		// double:
		// size: 8 bytes = 64 bits
		// range: upto 16 digits after decimal
		double d = 12.28369890870;
		double d1 = 200; 
		System.out.println(d1); // 200.0

		// char: char coming from numeric family
		// size: 2 bytes = 16 bits
		char c1 = 'a'; // a-z
		char c11 = 'b';
		char c2 = '1'; // 1 is a character not number
		// max numeric character 1-9.
		char c3 = 'z';
		char c4 = '$'; 

		char gender = 'f';
		char status = 'Y';

		System.out.println(c1); // a
		System.out.println(c1 + c11); // 97+98 = 195
		System.out.println(c1 - c11); // 97-98 = -1
		//
		// every programming language are pre-defined.(ASCII-value)
		// ASCII value -- table(pre-defined)
		// a-z : 97 to 122
		// A-Z : 65 to 90
		// 0-9 : 48 to 57
		char r1 = '0';
		char r2 = '9';
		// when we do Arithmetic Operation ASCII value will be consider
		System.out.println(r1 + r2); // 105
		System.out.println(r1 * r2); // 2736
		System.out.println(r1); // 0

		char u1 = 'a';
		char u2 = 'b';
		System.out.println(u1 + "" + u2); // ab

		System.out.println(u1); // a
		System.out.println((int) u1);// 97 
		System.out.println((int) u1 + (int) u2); // 195
		System.out.println(u1 + 0); // 97 //0 is an integer here
		System.out.println(u1 + '0'); // 97+48=145

		System.out.println(1 + 2);// 3
		System.out.println('a' + 'b'); // 195
		System.out.println(100); // 100 
		System.out.println(1); 
		// we cannot print more than int value(-128 to 127).
//		System.out.println(1999999999999);

		// boolean
		// size: ~ 1 bit
		boolean fg = true;
		boolean fg1 = false;
	}

}
