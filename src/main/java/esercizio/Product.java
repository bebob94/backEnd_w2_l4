package esercizio;

import lombok.ToString;

@ToString
public class Product {

	   Long id;
	    String name;
	    String category;
	    Double price;

	    public Product(Long id, String name, String category, Double price) {
	        this.id = id;
	        this.name = name;
	        this.category = category;
	        this.price = price;
	    }
	    
	    @Override
	    public String toString() {
	        return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
	    }
}
