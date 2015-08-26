package mathemathicOperations;

public class ArithmeticSequence {
	public static int[] returnFilledSequence(int startValue, int step, int length)
	{
		int[] retVal = new int[length];
		retVal[0] = startValue;
		for(int i=1; i<length; i++)
		{
			retVal[i] = startValue + step * i;
		}
		
		return retVal;
	}
}
