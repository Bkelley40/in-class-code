
public class BinarySearch 
{
	public static <T extends Comparable<T>> int search (T[] items, T searchKey, int low, int high)
	{
		int middle = (low + high)/2;	
		
		// if we find it
		int comparison = items[middle].compareTo(searchKey); // -1, 0 , 1
		
		if (low > high)
		{
			return -1;
		}
		if (comparison == 0) // base case
		{
			return middle;
		}
		else if (comparison == 1)
		{
			high = middle - 1;
			return BinarySearch.search(items, searchKey, low, high);			
		}
		else
		{
			low = middle + 1;
			return BinarySearch.search(items, searchKey, low, high);			
		}
	}
}