package BuilderPattern;

public class EcommAppllication {
	
	
	public EcommAppllication login() {
		System.out.println("login to app");
		return this;  // this keyword returning current class object(same object)
	}

	public EcommAppllication login(String un, String pwd) {
		System.out.println("login to app :" + un + ";" + pwd);
		return this;
	}
	
    public EcommAppllication doSearch(String productName) {
		System.out.println("search product: " + productName);
		return this;
	}

	public EcommAppllication doSearch(String productName, int price) {
		System.out.println("search product: " + productName + ": price" + price);
		return this;
	}

	public EcommAppllication doSearch(String productName, int price, String brand) {
		System.out.println("search product: " + productName + ": price" + price + "brand " + brand);
		return this;
	}

	public EcommAppllication addToCart(String productName) {
		System.out.println("add to cart :" + productName);
		return this;
	}

	public EcommAppllication doPayment(String cc, int cvv) {
		System.out.println("making payment using : " + cc + ": " + cvv);
		return this;
	}

	public EcommAppllication doPayment(String upi) {
		System.out.println("making payment using : " + upi);
		return this;
	}

	public EcommAppllication doPayment(String paypal, String password) {
		System.out.println("making payment using : " + paypal + ": " + password);
		return this;
	}

	public EcommAppllication generateOrder() {
		System.out.println("your order id is : " + 12345);
		return this;
	}

	public EcommAppllication logout() {
		System.out.println("logout");
		return this;
	}

}
