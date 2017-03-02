
public class ArraySet implements Set 
{
	
	private Object[] elements;
	private int itemsInArray = 0;
	
	
	public ArraySet()
	{
		this.elements = new Object[5];
	}
	
	public ArraySet(int size)
	{
		if (size < 0) 
		{
			throw new IllegalArgumentException("Capacity must be >= 0");
		}
		this.elements = new Object[size];
	}

	
	@Override
	public void add(Object element) 
	{
		ensureCapacity();
		if(!this.contains(element))
		{
			elements[itemsInArray] = element;
			itemsInArray++;
		}
	}

	@Override
	public void addAll(Object[] newElements) 
	{
		for(int i = 0; i < newElements.length; i++)
		{
			this.add(newElements[i]);
		}
	}

	@Override
	public boolean contains(Object element) 
	{
		boolean contains = false;
		for(int i = 0; i < itemsInArray; i++)
		{
			if(elements[i].equals(element))
			{
				contains = true;
			}
		}
		return contains;
	}

	@Override
	public int getSize() 
	{
		return itemsInArray;
	}

	@Override
	public void remove(Object element) 
	{
		for(int i = 0; i < itemsInArray; i++)
		{
			if(elements[i].equals(element))
			{
				elements[i] = elements[itemsInArray-1];
				itemsInArray--;
			}
		}
	}

	@Override
	public Set union(Set anotherSet) 
	{
		Set part1 = anotherSet.difference(this);
		for(int i = 0; i < itemsInArray; i++)
		{
			part1.add(elements[i]);
		}
		return part1;
	}

	@Override
	public Set intersection(Set anotherSet) 
	{
		Set temp = new ArraySet();
		for(int i = 0; i < this.getSize(); i++)
		{
			if(anotherSet.contains(elements[i]))
			{
				temp.add(elements[i]);
			}
		}
		return temp;
	}

	@Override
	public Set difference(Set anotherSet) 
	{	
		Set temp = new ArraySet();
		for(int i = 0; i < this.getSize(); i++)
		{
			if(!anotherSet.contains(elements[i]))
			{
				temp.add(elements[i]);
			}
		}
		return temp;
	}
	
	private void ensureCapacity() 
	{
		if (itemsInArray == elements.length) 
		{
			Object[] newArray = new Object[(itemsInArray + 1) * 2];
			System.arraycopy(elements, 0, newArray, 0, itemsInArray);
			elements = newArray;
		}
	}
	

}
