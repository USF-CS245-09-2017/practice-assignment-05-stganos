import java.util.*;

public class QuickSort implements SortingAlgorithm
{
	//uses partition and sort to sort the array
	public void QuickSort(int[] a, int left, int right)
	{
		if (left < right)
		{
			int pivot = partition(a, left, right);
			QuickSort(a, left, pivot - 1);
			QuickSort(a, pivot + 1, right);
		}//if
	}//QuickSort

	int partition(int[] a, int left, int right)
	{
		if (left < right)
		{
			int p = left;
			int i = left + 1;
			int j = right;

			while (i < j)
			{
				//checks if smaller
				while (i <= right && a[i] <= a[p])
				{
					i++;
				}//while

				//checks if bigger or equal
				while (j >= i && a[j] > a[p])
				{
					j--;
				}//while

				if (i <= right && i < j)
				{
					swap(a, i, j);
				}//if
			}//while
			swap(a, p, j);
			return j;
		}//if
		return left;
	}//partition

	//overrides sort function
	@Override
	public void sort(int[] a)
	{
		QuickSort(a, 0, a.length - 1);
	}//sort

	//interchanges two specified elemenst within an array
	public void swap(int[] a, int x, int y)
	{
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}//swap
}//class