public class PrimalNumbers
{
	public static void main(String[] args) 
	{
		int count = 0;
		for (int prime =2; prime< 100; prime++) 
		{
			for (int divisor=2; divisor<prime ; divisor++ ) 
			{
				if (prime%divisor==0) 
				{
					count++;
					break;
				}
			}
			if (count==0) 
			{
				System.out.println(prime);
			}
			else
			{
				count=0;
			}
		}
	}
}