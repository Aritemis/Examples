import java.awt.Color;

/**
 * A simple (and not all that useful) class that represents a circle object.
 *
 * @author Greg Gagne - August 2016
 */
 
public class CircleV1 
{
    private double radius;
    private java.awt.Color color;

    public CircleV1(double radius, java.awt.Color color) 
    {
        this.radius = radius;
        this.color = color;
    }

    /**
     * Expands the radius by a certain factor
     */
    public void expand(double factor) 
    {
        radius *= factor;
    }

    public String toString() 
    {
        return "A Circle with radius " + radius + " of color " + color;
    }
    
    private double getRadius()
    {
    	return this.radius;
    }
    
    private Color getColor()
    {
    	return this.color;
    }
    
    public boolean equals(CircleV1 otherCircle)
    {
    	
    	
    	 /**
         * Quick check #1: No object can be equal to null
         */
        if (otherCircle == null)
            return false;

        /**
         * Quick check #2: If 'this' and 'other' are the
         * same object, they are equal so return true.
         */
        if (otherCircle == this)
            return true;
       
        /**
         * Quick check #3: Make sure that other
         * is in fact a Circle. If it is not,
         * return false.
         */
        if ( !(otherCircle instanceof CircleV1))
            return false;
       
        /**
         * We know that other is a Circle, let's now
         * compare the relevant instance data
         */
       
        /* typecast other to a Circle */
        CircleV1 o = (CircleV1)otherCircle;
       
        /**
         * Check the instance data for equality
         */
        if ( (this.radius == o.radius) && (this.color == o.color) )
            return true;
        else
            return false;
    	
    	
    	
    	

    	
//    	boolean same = false;
//    	if(this == otherCircle)
//    	{
//    		return true;
//    	}
//    	if(this != null && otherCircle != null && otherCircle instanceof CircleV1)
//    	{
//    		
//    	}
//    	return same;
    }
}
