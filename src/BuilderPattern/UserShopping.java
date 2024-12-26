package BuilderPattern;

public class UserShopping {

	public static void main(String[] args) {
		
         EcommAppllication app = new EcommAppllication();
	
	app.login("naveen@gmail.com", "naveen123")
	.doSearch("mackbook")
	    .addToCart("mackbook pro")
	        .doPayment("1212 1345 2455 4566", 899)
	            .generateOrder()
	                 .logout();
	
	System.out.println("---------------------");
	
	//
	app.login("naveen@gmail.con", "naveen123")
	   .doSearch("tshirt", 5000, "nike")
	      .addToCart(null)
	         .logout();
	
	System.out.println("---------------------");
	
	app.login("naveen@gmail.con", "naveen123")
	    .addToCart("tshirt")
	        .doPayment("naveen234")
	            .generateOrder()
	                 .logout();
	System.out.println("---------------------");
	
	app.login("meena@gmail.con", "meena123")
	    .logout();
	
	}

}
