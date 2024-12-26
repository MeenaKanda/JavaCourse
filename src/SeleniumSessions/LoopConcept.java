package SeleniumSessions;

public class LoopConcept {

	public static void main(String[] args) {

		// print 1 to 10
		// 1. while:

		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			// i++;
			// ++i;
			i = i + 1;
		}

		System.out.println("-----------------------------");
		//
		while (true) {
			System.out.println("welcome to taj hotel");
			break;
		}

		System.out.println("-----------------------------");

		// print odd number 1 to 99
		int p = 1;
		while (p <= 100) {
			System.out.println(p); // 1 3 5 7 ......99
			p = p + 2;
		}

		System.out.println("-----------------------------");

		// print even number 0 to 100
		int p1 = 0;
		while (p1 <= 100) {
			System.out.println(p1); //
			p1 = p1 + 2;
		}

		System.out.println("-----------------------------");

		// print number divisible by 5
		int num = 1;
		while (num <= 100) {
			System.out.println(num);
			if (num % 5 == 0) {
				System.out.println("hi");
			}
			num++;
		}
		System.out.println("-----------------------------");

		// print 1 2 3 4 5 hi
		int num1 = 1;
		while (num1 <= 100) {
			System.out.println(num1);
			if (num1 % 5 == 0) {
				System.out.println("hi");
				break; // break the entire while loop
			}
			num1++;
		}
		System.out.println("-----------------------------");

		// print Anjali 5 time
		int n = 1;
		while (n <= 5) {
			System.out.println(n + " = " + "Anjali");
			n++;
		}
		System.out.println("-----------------------------");

		
		int counter = 100;
		while (counter >= 100) {
			System.out.println(counter);

			if (counter == 200) {
				System.out.println("bye!!");
				break; // this break entire while loop
			}
			counter++;
		}

		System.out.println("-----------------------------");

		// using if condition in while loop
		int score = 0;
		while (score <= 100) {
			System.out.println(score);
			if (score == 25) {
				System.out.println("score is 25....yay");
			}
			if (score == 50) {
				System.out.println("half...century");
			}
			if (score == 100) {
				System.out.println("century");
			}
			score++;
		}
		System.out.println("-----------------------------");

		// using swith case in while loop
		int score1 = 0;
		while (score1 <= 100) {
			// System.out.println(score1);
			switch (score1) {
			case 25:
				System.out.println(score1);
				System.out.println("score is 25...yay");
				break; // this break , breaks the switch case not break a while loop
			case 50:
				System.out.println(score1);
				System.out.println("half ...century");
				break;
			case 100:
				System.out.println(score1);
				System.out.println("century");
				break;

			default:
				System.out.println(score1);
				break;
			}
			score1++;
		}

	}

}
