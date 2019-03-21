import java.util.ArrayList;

public class Max {
	public static <DataType extends Comparable<DataType>> DataType max (ArrayList<DataType> numbers)
	{
		DataType highest = numbers.get(0);
		for (int i = 1; i < numbers.size(); ++i)
		{
			if (numbers.get(i).compareTo(highest) > 0)
			{
				highest = numbers.get(i);
			}
		}
		return highest;
	}
}
