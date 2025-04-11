package Java8Stream.filterDemos;

import java.util.ArrayList;
import java.util.List;

class Product{
	int id;
	String name;
	double price;

	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
}

public class filterDemo4 {

	public static void main(String[] args) {
	
		List<Product> productList = new ArrayList<Product>();
		
		productList.add(new Product(1, "Hp Laptop", 25000));
		productList.add(new Product(2, "Dell Laptop", 30000));
		productList.add(new Product(3, "Lenovo Laptop",28000));
		productList.add(new Product(4, "Sony Laptop", 23000));
		productList.add(new Product(5, "Apple Laptop", 90000));
		
		productList.stream()
		                   .filter(p->p.price>25000)          //this filter filterint whole object
		                   .forEach(pr->System.out.println(pr.price));  //iterating the object
		
		
	}

}
