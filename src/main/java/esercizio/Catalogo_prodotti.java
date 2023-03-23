package esercizio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Catalogo_prodotti {

	public static void main(String[] args) {

		Customer client = new Customer((long) 1, "Luca", 1);
		Customer client2 = new Customer((long) 2, "Kevin", 2);
		Customer client3 = new Customer((long) 3, "Bebo", 1);
		Customer client4 = new Customer((long) 4, "Dany", 3);
		Customer client5 = new Customer((long) 5, "Vichingo", 5);

		Product newProd = new Product((long) 52364, "Iphone ", "Phone", 1294.25);
		Product newProd2 = new Product((long) 54264, "Imac", "Computer", 2494.00);
		Product newProd3 = new Product((long) 52364, "Magic mouse", "Accessories", 94.25);
		Product newProd4 = new Product((long) 52644, "Apple keyboard", "Accessories", 74.38);
		Product newProd5 = new Product((long) 52634, "Ipad", "Tablet", 974.38);
		Product newProd6 = new Product((long) 52464, "Green lights", "Book", 174.38);
		Product newProd7 = new Product((long) 52564, "Harry Potter and The Deathly Hallows part 1", "Book", 125.38);
		Product newProd8 = new Product((long) 52364, "Colora e impara", "Baby", 154.38);
		Product newProd9 = new Product((long) 52624, "Farcisci i bignÃ¨", "Baby", 24.38);
		Product newProd10 = new Product((long) 52564, "Men's Health", "Boys", 514.38);
		Product newProd11 = new Product((long) 52164, "X-box One", "Boys", 14.38);

		List<Product> orders = new ArrayList<Product>();
		orders.add(newProd);
		orders.add(newProd10);
		orders.add(newProd8);
		List<Product> orders2 = new ArrayList<Product>();
		orders2.add(newProd6);
		orders2.add(newProd7);
		List<Product> orders3 = new ArrayList<Product>();
		orders3.add(newProd3);
		orders3.add(newProd9);
		orders3.add(newProd10);
		List<Product> orders4 = new ArrayList<Product>();
		orders4.add(newProd4);
		orders4.add(newProd10);
		orders4.add(newProd8);
		List<Product> orders5 = new ArrayList<Product>();
		orders5.add(newProd5);
		orders5.add(newProd7);
		orders5.add(newProd9);

		Order order_1 = new Order((long) 1, "delivered", LocalDate.parse("2020-02-21"), LocalDate.parse("2020-02-22"),orders, client);
		Order order_2 = new Order((long) 1, "delivered", LocalDate.parse("2020-02-21"), LocalDate.parse("2020-02-22"),orders2, client);
		Order order_3 = new Order((long) 1, "delivered", LocalDate.parse("2020-02-21"), LocalDate.parse("2020-02-22"),orders3, client);
		Order order_4 = new Order((long) 1, "delivered", LocalDate.parse("2020-02-21"), LocalDate.parse("2020-02-22"),orders4, client);
		Order order_5 = new Order((long) 1, "delivered", LocalDate.parse("2020-02-21"), LocalDate.parse("2020-02-22"),orders5, client);

		List<Order> myorders = new ArrayList<Order>();
		myorders.add(order_1);
		myorders.add(order_2);
		myorders.add(order_3);
		myorders.add(order_4);
		myorders.add(order_5);	

		List<Product> s = orders2.stream().filter(x->
		{boolean b = x.category.equals("Book") && x.price > 100;
			return b;
		})
		.collect(Collectors.toList());	
		
		System.out.println(s.toString());	
		
	}

}
