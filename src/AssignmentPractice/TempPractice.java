package AssignmentPractice;

public class TempPractice {

	public static void main(String[] args) {

		// 2. WAP to print following output:I am Batman 1

		for(int i = 1; i<=9; i++) {
			System.out.println("I am Batman " + i);
		}
		
		//3. WAP to print 10 to 1 using for, while and do-while loop
		for(int i=10; i>=1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		int i = 10;
		while( i >=1) {
			System.out.print(i + " ");
			i--;
		}
		System.out.println();
		int k = 10;
		do {
			System.out.print(k + " ");
			k--;	
		}while(k>=1);
			
		//4. Write a program in Java to print "Hello World" ten times using while loop
		
		int l = 1;
		while(l<=10) {
			System.out.println("Hello World " + l);
			l++;
		}
		
		//6. WAP to find out the max number from the given three different positive numbers.
		
		int num1 = 600;
		int num2 = 2000;
		int num3 = 300;
		if(num1>num2 && num1>num3) {
			System.out.println("num1 is greatest : " + num1);
		}
		else if(num2>num1 && num2>num3) {
			System.out.println("num2 is greatest : " + num2);
		}
		else {
			System.out.println("num3 is greatest : " + num3);
		}
		
		//7. print all odd and even numbers between 1 to 100
		System.out.println("even numbers :");
		for(int j = 1; j<=100; j++) {
			if(j%2 == 0) {
				System.out.print(j + " ");
				}
			}
		System.out.println();
		System.out.println("odd numbers : ");
		for(int j = 1; j<=100; j++) {
			if(j%2 != 0) {
				System.out.print(j + " ");
			}
		}
		System.out.println();
		//9. Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop.
		for(char j ='a'; j<='z'; j++) {
			System.out.print((int)j + ", ");
		}
		System.out.println();
		char x='a';
		while(x<='z') {
			System.out.print((int)x + " ");
			x++;
			}
		System.out.println("-----------");
		
		for(char j ='A'; j<='Z'; j++) {
			System.out.print((int)j + " ");
		}
		System.out.println();
		
		char y='A';
		while(y<='Z') {
			System.out.print((int)y + " ");
			y++;
		}
		System.out.println("-----------");
		
		for(int m=0; m<=9; m++) {
			System.out.print(m +" ");
		}
		System.out.println();
		
		int n = 0;
		while(n<10) {
			System.out.print(n + " ");
			n= n+1;
		}
		System.out.println();
		
		//10. Print the following series: //1.0 2.0 3.0  ...... 10.0  //0 5 10 15 20 25 …. 100
		for(float p=1; p<=10; p++) {
			System.out.print(p + "  ");
		}
		System.out.println();
		for(int q =0; q<=100; q++) {
			if(q%5 == 0) {
				System.out.print(q + " ");
			}
		}
		System.out.println();
		System.out.println("*********************");
		//11.Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.
		
		char alph = 'a';
		System.out.println("vowels of the alphabets :");
		while(alph<='z') {
			switch (alph) {
			case 'a':
				System.out.println(alph);
				break;
			case 'e':
				System.out.println(alph);
				break;
			case 'i':
				System.out.println(alph);
				break;
			case 'o':
				System.out.println(alph);
				break;
			case 'u':
				System.out.println(alph);
				break;
			default:
				break;
			}
			alph++;
		}
		
		//12. Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".
		for(int r=1; r<=10; r++) {
			System.out.println(r);
			if(r%7 == 0) {
				System.out.println(r +" : bye, see you tomorrow");
				break;
			}
		}
		
		//12. Write a cricket score card system using for and while loops:
		//if(score == 0) -- print - "Zero - duck"
		//if(score == 25) -- print - "good job"
		//if(score == 50) -- print - "good job - half century"
		//if(score == 100) -- print - "good job - century"
		
		for(int sc=0; sc<=100; sc++) {
			if(sc == 0) 
				System.out.println("Zero - duck");
			if(sc == 25)
				System.out.println("good job");
			if(sc == 50)
				System.out.println("good job - half century");
			if(sc == 100)
				System.out.println("good job - century");
				}
		System.out.println("---------------------");
		int score = 0;
		while(score<=100) {
			switch (score) {
			case 0:
				System.out.println("Zero - duck");
				break;
			case 25:
				System.out.println("good job");
				break;
			case 50:
				System.out.println("good job - half century");
				break;
			case 100:
				System.out.println("good job - century");
				break;
			default:
				break;
			}
			score++;
		}
		System.out.println("*******************");
		//print Anjali 5 times
	    int number=1;
		for(;;) {
			while(number<=5) {
			System.out.println("Anjali");
			number++;
			}
			break;
		}
		
		int number1 = 1;
		for(;number1<=5;) {
			System.out.println("Kanmani");
			number1++;
		}
		
	}

}
