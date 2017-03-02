package bag;

public class MyBag 
{
	
	private int current;
	private int capacity;
	private Object[] array = new Object[capacity];
	
	public void add(Object o)
	{
		boolean room = (getRemainingCapacity() > 0);
		if(room)
		{
			array[current] = o;
			current++;
		}
	}
	
	public int getRemainingCapacity()
	{
		return capacity - current;
	}

	public int size()
	{
		return current;
	}
	
	public boolean contains(Object o)
	{
		boolean contains = false;
		for(int i = 0; i < current; i++)
		{
			if(array[i].equals(o))
			{
				contains = true;
			}
		}
		return contains;
		
	}
	
	public void remove(Object o)
	{
		for(int i = 0; i < current; i++)
		{
			if(array[i].equals(o))
			{
				array[i] = array[current-1];
				current--;
			}
		}
	}
}
