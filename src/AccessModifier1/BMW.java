package AccessModifier1;

public class BMW extends Car{

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.name = "Meena";
		b.color = "red";
		b.seller= "honda";
//		b.price   //private can not be accessed by subclass in same package

		b.publicMethod();
		b.protectedMethod();
		b.defaultMethod();
//		b.privateMethod();  //can not access
	}

}
