
import static org.junit.Assert.*;
import org.junit.Test;


public class RectangleTest 
{

	@Test
	public void testPerimeter() 
	{
		Rectangle r1 = new Rectangle(5.0, 4.0);
		assertEquals(18.0, r1.perimeter(), 0.001);
	}

	@Test
	public void testArea()
	{
		Rectangle r1 = new Rectangle(8.0, 3.0);
		assertEquals(24.0, r1.area(), 0.001);
	}
}
