package StringManipuation1;

public class ReverseInteger {
	
	
	public static void reverseInteger() {
		
		int num = 478936;
		int rev = 0;
		
		while(num != 0) {
			int n = num % 10;
			rev = rev*10 + n;
			num = num/10;
		}
		System.out.println(rev);
		
	}

	public static void main(String[] args) {
		reverseInteger();

	}

}
