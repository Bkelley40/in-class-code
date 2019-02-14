import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int value;
		do
		{
			try
			{
				value = getInt(keyboard);
			}
			catch (NegativeNumberException foo)
			{
				System.out.println("Not a positive integer.");
				System.out.println(foo.getMessage());
			}
			catch (Exception e)
			{
				System.out.println("Invalid value");
				break;
			}
			finally
			{
				System.out.println("-------------");
			}
			System.out.println("foo");
			
		} while (true);
	}

	public static int getInt (Scanner keyboard) throws NegativeNumberException
	{
		System.out.print("Enter a positive integer: ");
		
		int input = keyboard.nextInt();
		System.out.println("Entered: "+input);
		checkIsPositive(input);
		return input;
	}
	
	public static void checkIsPositive (int input) throws NegativeNumberException
	{
		if (input < 0)
		{
			throw new NegativeNumberException("    "+input+" is not a positive integer.");
		}
	}
}
