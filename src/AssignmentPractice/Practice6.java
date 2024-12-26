package AssignmentPractice;

//Builder Pattern
public class Practice6 {
	
	public Practice6 dologin() {
		System.out.println("login");
		return this;
		
	}
	public Practice6 dologin(String un, String pwd) {
		System.out.println("login" + un + " " + "password : " + pwd);
		return this;
		
	}
	public Practice6 doSearch(String prnm, int price, String brand) {
		System.out.println("product name : " + prnm + " " + "Price ; " + price + " " + "Brand : " + brand );
		return this;
		
	}
	public Practice6 doSearch(String prnm, int price) {
		System.out.println("product name : " + prnm + " " + "Price ; " + price );
		return this;
		
	}
	public Practice6 addtocart() {
		System.out.println("click the addto cart button");
		return this;
	}
	public Practice6 doPayment(int cc, int ccv) {
		System.out.println("do the payment through credit card");
		return this;
	}
	public Practice6 dopayment(int upi) {
		System.out.println("do payment through upi");
		return this;
	}
	public Practice6 generateOrder() {
		System.out.println("ordernumber : " + 386890);
		return this;
	}
	public Practice6 logout() {
		System.out.println("logout of the application");
		return this;
	}
	

	public static void main(String[] args) {
		
		Practice6 pr = new Practice6();
		
		pr.dologin("Meena@gmail.com", "meena123")
		.doSearch("handbag", 100, "michele")
		.addtocart()
		.doPayment(29897900, 234)
		.generateOrder()
		.logout();
System.out.println("-----------------------");
		pr.dologin("Meena@gmail.com", "meena123")
		.dopayment(987)
		.dologin()
		.doSearch("bag", 100);
	}

}
