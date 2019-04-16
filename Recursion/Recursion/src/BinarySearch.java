
public class BinarySearch 
{
	public static <T extends Comparable<T>> int search (T[] items, T searchKey)
	{
		int middle = items.length/2;
		
		// if we find it
		int comparison = items[middle].compareTo(searchKey); // -1, 0 , 1
		
		if (comparison == 0)
		{
			return middle;
		}
		BinarySearch.search(items,  searchKey);
		return 0;
	}
}