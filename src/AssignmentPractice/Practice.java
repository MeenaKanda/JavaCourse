package AssignmentPractice;

public class Practice {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			while (i % 2 != 0) {
				System.out.println(i); // 1 infinity
				break; // break out of while loop
			}
		}
		System.out.println("********************************");

		for (int j = 0; j <= 10; j++) {
			if (j % 2 != 0) {
				System.out.println(j);
			}
		}

		System.out.println("********************************");

		int k = 1;
		for (; k <= 10;) {
			System.out.println(k);
			k++;
		}
		System.out.println("********************************");

		// repeat Anjali 5 times
		int n = 1;
		for (;;) {
			while (n <= 5) {
				System.out.println("Anjali");
				n++;
			}
			break;
		}

		System.out.println("-------------------------------");

		// why cant we use if condition here?
		int m = 1;
		for (;;) {
			if (m <= 5) {
				System.out.println("Anjali"); // Anjali
				m++;
				if (m == 6) {
					break;
				}
			}

		}

		// System.out.println("********************************");
		// print 5 to 50
		for (int l = 5; l <= 50; l++) {
			System.out.println(l);
			if (l % 5 == 0) {
				System.out.println(l);
			}

		}

		System.out.println("********************************");

		// Ascii value
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.println(c);
			if (c == 'c') {
				System.out.println((int) c);
			}
		}
		System.out.println("********************************");
		//
		for(char a = 'A'; a<='Z'; a++) {
			System.out.println(a);
			if((int)a % 5 == 0) {
				System.out.println((int)a + (int)a + " = " + " added");
				
			}
			
		}

	}

}
