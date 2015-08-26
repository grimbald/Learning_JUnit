package mathemathicOperations;

public class Power {
	public static int powerBy(int base, int pow)
	{
		int retVal = 1;
		for(int i=0; i<pow;i++)
		{
			retVal *= base;
		}
		
		return retVal;
	}
}
