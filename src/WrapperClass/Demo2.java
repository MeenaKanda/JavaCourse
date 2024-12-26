package WrapperClass;

public class Demo2 {

	public static void main(String[] args) {
		
		
		String price1 = "500";
		String price2 = "300";
		
		System.out.println(price1+price2);
		
		int p1 = Integer.parseInt(price1);
		int p2 = Integer.parseInt(price2);
		
		System.out.println(p1+p2);
		
		String price3 = "500.50";
		String price4 = "300.25";
		
		System.out.println(price3+price4);
		
		double d1 = Double.parseDouble(price3);
		double d2 = Double.parseDouble(price4);
		
		System.out.println(d1+d2);
		
	}

}
