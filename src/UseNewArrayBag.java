import java.util.Iterator;


public class UseNewArrayBag 
{
	public static void main(String[] args)
	{
		double total = 0.0;
		Item contents = null;
		NewBag<Item> arrayBag = new NewArrayBag<Item>();
		Item item1 = new Item("item1", 1, .10);
		Item item2 = new Item("item2", 1, .20);
		Item item3 = new Item("item3", 1, .30);
		arrayBag.add(item1);
		arrayBag.add(item2);
		arrayBag.add(item3);
		
		Iterator<Item> iterator = arrayBag.iterator();
		
		while (iterator.hasNext()) {
            contents = iterator.next();

            total += contents.getTotalCost();
        }
		System.out.println("Total cost is $" + total);
	}
}
