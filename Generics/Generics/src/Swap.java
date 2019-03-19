
public class Swap {
	public static <T> void swap (T[] myArr, int i, int j)
	{
		T temp = myArr[i];
		myArr[i] = myArr[j];
		myArr[j] = temp;
	}

}
