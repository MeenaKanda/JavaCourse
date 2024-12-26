package AssignmentPractice;

public class HW {

	public static void main(String[] args) {

		// WAP to print following output:
		for (int i = 1; i <= 5; i++) {
			System.out.println("Batman" + i);
		}

		// WAP to print 10 to 1 using for,while,do while loop
		for (int j = 10; j >= 1; j--) {
			System.out.println("for loop : " + j);
		}

		System.out.println("---------------------------");
		// while loop
		int k = 10;
		while (k >= 1) {
			System.out.println("while : " + k);
			k--;
		}
		System.out.println("---------------------------");
		// do while loop
		int z = 10;
		do {
			System.out.println("do while : " + z);
			z--;
		} while (z >= 1);

		System.out.println("---------------------------");

		// WAP in java to print "Hello World" ten times using while loop
		int l = 1;
		while (l <= 10) {
			System.out.println(l + ": " + "Hello World");
			l++;
		}
		System.out.println("---------------------------");

		// Print all even and odd numbers between 1 to 100

		for (int x = 1; x <= 100; x++) {
			if (x % 2 == 0) {
				System.out.println("even number : " + x);
			} else {
				System.out.println("odd number : " + x);
			}
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
		System.out.println("---------------------------");
		// Print A-Z , a-z, 0-9 with respective ASCII numbers the console one using
		// while and for loop

		for (char y = 'A'; y <= 'Z'; y++) {
			System.out.println("forloop: " + (int) y);
		}
		
		System.out.println("---------------------------");
		 char m = 'A';
		 while(m<='Z') {
			 System.out.println("while: " + (int)m);
			 m++;
		 }

		 System.out.println("---------------------------");
		 //ASCII value of 0 to 9
		 for(char y1 = '0'; y1<= '9'; y1++) {
			 System.out.println("for loop: " + (int) y1);
		 }
		 System.out.println("---------------------------");
		 char y2 = '0';
		 while(y2<='9') {
			 System.out.println("while: " + (int)y2);
			 y2++;
		 }
		 System.out.println("---------------------------");
		 
		 //Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.
		 for(char a1 = 'a'; a1<= 'z'; a1++) {
			 switch (a1) {
			case 'a':
				System.out.println(a1);
				break;
			case 'e':
				System.out.println(a1);
				break;
			case 'i':
				System.out.println(a1);
				break;
			case 'o':
				System.out.println(a1);
				break;
			case 'u':
				System.out.println(a1);
				break;

			default:
				break;
			}
		 }
		 
		 System.out.println("---------------------------");
		 
		 ////print (aeiou) using while loop(switch case)
	/*	 char a2 = 'a';
		 while(a2<='z') {
			 switch (a2) {
				case 'a':
					System.out.println(a2);
					a2++;
					break;
				case 'e':
					System.out.println(a2);
					a2++;
					break;
				case 'i':
					System.out.println(a2);
					a2++;
					break;
				case 'o':
					System.out.println(a2);
					a2++;
					break;
				case 'u':
					System.out.println(a2);
					a2++;
					break;

				default:
					a2++;
					break;
			 }
		 }*/
		 
  /*   	 char alph = 'a';
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
			} */
			
		 System.out.println("---------------------------");
		 //print (aeiou) using while loop(if statement)
		char a3 = 'a';
		while(a3<= 'z') {
			if(a3 == 'a' || a3 == 'e' || a3 == 'i' || a3 == 'o' || a3 == 'u') {
				System.out.println(a3);
				}
			a3++;
		}
		System.out.println("---------------------------");
		//print (aeiou) using for loop(if statement)
		for(char a4 = 'a'; a4<='z'; a4++) {
			if(a4 == 'a' || a4 == 'e' || a4 == 'i' || a4 == 'o' || a4 == 'u') {
				System.out.println(a4);
				}
		}
		
		//10. Print the following series: 
        //1.0 2.0 3.0  ...... 10.0
		//0 5 10 15 20 25 …. 100
		
		// print 1.0 2.0 3.0  ...... 10.0
		for(double b1 = 1.0; b1<=10.0; b1++) {
			System.out.print(b1 + " ");
		}
		System.out.println();
		
		System.out.println("*********************");
		
		for(int b2 = 1; b2<=10; b2++) {
			System.out.print((float)b2 + " ");
		}
		System.out.println();
		
		
		System.out.println("---------------------------");
		
		//print 0 5 10 15 20 25 …. 100
		for(int c1 = 5; c1<=100; c1++) {
			if(c1 % 5 == 0) {
				System.out.print(c1 + " ");
			}
			
		}
		System.out.println();
		
		//Print 1 to 10 and break the loop once you find the multiplication of 7 
		for(int d = 1; d<=10; d++) {
			System.out.println(d);
			if(d % 7 == 0) {
				System.out.println("bye");
				break;
			}
		}
		
		System.out.println("*********************");
		//12. Write a cricket score card system using for and while loops:
              //if(score == 0) -- print - "Zero - duck"
              //if(score == 25) -- print - "good job"
              //if(score == 50) -- print - "good job - half century"
              //if(score == 100) -- print - "good job - century"
		 
		for(int score = 0; score<=100; score++) {
			if(score == 0) {
				System.out.println("zero - duck");
			}
			if(score == 25) {
				System.out.println("good job");
			}
			if(score == 75) {
				System.out.println("good job - half century");
			}
			if(score ==100) {
				System.out.println("good job-century");
			}
			
			}
		System.out.println("*********************");
		//
		int score1 = 0;
		while(score1<=100) {
			if(score1 == 0) {
				System.out.println("zero - duck");
			}
			if(score1 == 25) {
				System.out.println("good job");
			}
			if(score1 == 75) {
				System.out.println("good job - half century");
			}
			if(score1 ==100) {
				System.out.println("good job-century");
			}
			score1++;
		}
		System.out.println("*********************");
		
		for(int score2 = 0; score2<=100; score2++) {
			switch (score2) {
			case 25:
				System.out.println("zero-duck");
				break;
			case 50:
				System.out.println("good job");
				break;
			case 75:
				System.out.println("good job- half century");
				break;
			case 100:
				System.out.println("good job-century");
				break;

			default:
				break;
			}
		}
		
		
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
	}

}
