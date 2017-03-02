/**
 * @author Ariana Fairbanks
 * Generate the co-primes from (1,1) to (m,n)
 */

public class CoPrimes 
{
	public static void main(String[] args) 
	{
		if (args.length != 2) 
		{
			System.err.println("Must be passed two integer values > 0");
			System.exit(0);
		}
		
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		
		for(int row = m; row > 0; row --)
		{
			for(int col = 1; col <= n; col++)
			{
				int gcd = elucid(row, col);
				if (gcd != 1)
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.println("");
		}
		
	}
	private static int elucid(int first, int second) 
	{
	    int temp;
	    while(second != 0){
	        temp = first;
	        first = second;
	        second = temp % second;
	    }
	    return first;
	}

}
