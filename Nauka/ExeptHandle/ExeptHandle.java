package exepthandle;

		import java.lang.*;
		import javax.swing.*;
		import java.awt.*;
// nefasdf

public class ExeptHandle extends JFrame
{
	public static void main(String[] args)
	{
		devideByZero(2);
	}
	public static void devideByZero(int input)
	{
		try
		{
			System.out.println(input/0);
		}
		catch (ArithmeticException e)
		{
			Sytstem.out.println(e);
		}
	}
}
