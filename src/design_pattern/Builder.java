package design_pattern;

import java.io.IOException;

public class Builder {
public static void main(String[] args) throws IOException {
	OrderBuilder builder=new OrderBuilder();
	
	OrderedItems orderedItems=builder.preparePizza();
	
	orderedItems.showItems();
	System.out.println("\n");
	System.out.println("Total Cost: "+ orderedItems.getCost());
	System.out.println("========================================");
	System.out.println("Thank you !!!    Visit come again !!!");
	

	
}
}
