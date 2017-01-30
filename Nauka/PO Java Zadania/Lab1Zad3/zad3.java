
public class zad3
{
	public static void main(String[] args)
	{
		if (args.length <= 0)
		{
			System.err.println("Argument can't be NULL");
			System.exit(0);
		}
		int firstArg=0;
		if (args.length > 0)
		{
		    try 
		    {
		        firstArg = Integer.parseInt(args[0]);
		    } catch (NumberFormatException e) 
		    {
		        System.err.println("Argument" + args[0] + " must be an integer.");
		        System.exit(1);
		    }
		}


		int x;
		int y;
		
		for(x=1; x <= firstArg ; x++)
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
