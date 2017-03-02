
public class Square implements Shape 
{

	private double length;
	private double width;
	
	@Override
	public double getPerimeter() 
	{
		return 2 * (length + width);
	}

	@Override
	public double getArea() 
	{
		return length * width;
	}

}
