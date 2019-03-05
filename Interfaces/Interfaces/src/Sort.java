
public class Sort {
	public static void sort (Comparable[] numbers)
	{
		for (int i = 0; i < numbers.length; ++i)
		{
			for (int j = i; j < numbers.length; ++j)
			{
				if (numbers[i].compareTo(numbers[j]) > 0)
				{
					swap(numbers, i, j);
				}
			}
		}
	}
	
	private static void swap (Comparable[] numbers, int i, int j)
	{
		Comparable temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}
}
