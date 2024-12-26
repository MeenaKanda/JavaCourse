package SeleniumSessions;

import java.util.Arrays;

public class returnArray {

	// We can return an array from function and also pass an array as parameters to
	// a function.
	// Refer below example:-

	int []arr = new int[4];
	
	public int[] fillArray() {
		for (int i = 0; i < 4; i++) {
			arr[i] = i+2;
		}
		return arr;
	}
	
    public void printArray(int b[]) {
    	for(int i=0; i<b.length; i++) {
    		System.out.println(b[i]);
    	}
    }

	public static void main(String[] args) {
		
		returnArray a = new returnArray();
		int b[] = a.fillArray();
//		System.out.println(Arrays.toString(b));
		
		a.printArray(b);
		
	}

}
