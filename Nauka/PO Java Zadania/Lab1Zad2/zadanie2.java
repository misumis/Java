
public class zadanie2
{
	public static void main(String[] args)
	{
		int x;
		int y;
		for(x=1; x<100; x++)
		{
			boolean Prime = true;
			for(y=2; y<x; y++)
			{
				
				if (x%y==0) 	
				{
					Prime = false;
					break;
				}
			}
			if (Prime)
				{
					System.out.print(x + " ");
				}
		}
	}
}
