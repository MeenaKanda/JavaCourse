package WrapperClass;

public class Demo3 {

	public static void main(String[] args) {
		
		
		//AutoBoxing:
		int a = 100;
		Integer b = a;
		System.out.println(b);
		
	
		//Boxing:
		int x = 90;
		Integer y = Integer.valueOf(x);
		System.out.println(y);
		
		
		//AutoUnBoxing::
		Integer result = 100;
		int res = result;
		System.out.println(res);
		
		//UnBoxing:
		Integer mark = 98;
		int newmark = mark.intValue();
		System.out.println(newmark);
	}

}
