import java.util.ArrayList;

public class Max {
	public static Integer max (ArrayList<Integer> numbers)
	{
		Integer highest = numbers.get(0);
		for (int i = 1; i < numbers.size(); ++i)
		{
			if (numbers.get(i) > highest)
			{
				highest = numbers.get(i);
			}
		}
		return highest;
	}
}
