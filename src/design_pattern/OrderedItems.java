package design_pattern;

import java.util.ArrayList;
import java.util.List;

public class OrderedItems {
List<Item> items=new ArrayList<Item>();
public void addItems(Item item)
{
	items.add(item);
	}
public float getCost()
{
	float cost=0.0f;
	for(Item item:items)
	{
		cost+=item.price();
	}
	return cost;
}
public void showItems()
{
for(Item item: items)
{
System.out.println("Items is: "+ item.name());
System.out.println("Items is: "+ item.size());
System.out.println("items is: "+ item.price());

}
}
}
