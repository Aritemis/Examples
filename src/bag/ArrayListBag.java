package bag;
import java.util.ArrayList;


public class ArrayListBag implements Bag 
{

	private ArrayList<Object> arrayList = new ArrayList<Object>();
	
	@Override
	public void add(Object element) 
	{
		arrayList.add(element);
	}

	@Override
	public void addAll(Object[] elements) 
	{
//		arrayList.addAll(elements);
	}

	@Override
	public boolean contains(Object element) 
	{
		boolean contains = false;
		if(arrayList.contains(element))
		{
			contains = true;
		};
		return contains;
	}

	@Override
	public int getSize() 
	{
		return arrayList.size();
	}

	@Override
	public void remove(Object element) 
	{
		arrayList.remove(element);
	}

}
