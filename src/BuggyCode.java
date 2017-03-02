/**
 * A simple demonstration of using the debugger
 */

public class BuggyCode
{
    private int[] values;

    public BuggyCode(int[] values) 
    {
        this.values = values;
    }

    /**
     * Returns the maximum value
     */
    public int max() 
    {
        int max = values[0];

        for (int i = 0; i < values.length; i++) 
        {
            if (max < values[i])
                max = values[i];
        }

        return max;
    }

    /**
     * Returns the minimum value
     */
    public int min() 
    {
        int min = values[0];

        for (int i = 0; i < values.length; i++) 
        {
            if (min > values[i])
                min = values[i];
        }

        return min;
    }
}

