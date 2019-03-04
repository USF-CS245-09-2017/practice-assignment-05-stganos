import java.util.*;

public class InsertionSort implements SortingAlgorithm
{

	// //constructor
	// public InsertionSort()
	// {
	// 	temp = 0;
	// }

	//sorts the array of integers using the "insertion sort method"
	@Override
	public void sort(int[] a)
	{
		//instance data
		//int[] a;
		int temp;
		int toSwap;
		for (int i = 1; i < a.length; i++)
		{
			temp = a[i];
			toSwap = i - 1;

			while (temp < a[toSwap] && toSwap > 0)
			{
				a[toSwap + 1] = a[toSwap];
				toSwap--;
			}//while
			a[toSwap] = temp;
		}//for
	}//sort
}//class