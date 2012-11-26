import java.lang.Math;

public class HashUtilities 
{
	public static int shortHash(int x) 
	{
		int n = x;
		int hash = (n % 1000);
		return Math.abs(hash);
	}
}
