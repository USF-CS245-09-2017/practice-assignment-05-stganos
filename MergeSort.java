import java.util.*;

public class MergeSort implements SortingAlgorithm
{
	//override for sort new sort method
	@Override
	public void sort(int[] a)
	{
		int leftI = 0;
		int rightI = a.length - 1;
		mergeSort(a, leftI, rightI);
	}//sort

	//keeps calling the split function until the arrays are length 1
	public void mergeSort(int[] a, int leftI, int rightI)
	{
		if (leftI < rightI)
		{
			int mid = (leftI + rightI)/2;
			mergeSort(a, leftI, mid);
			mergeSort(a, mid + 1, rightI);
			merge(a, leftI, mid, rightI);
		}//if
	}//split




	private void merge(int[] a, int left, int mid, int right)
	{
		//ints
		int number1 = mid - left + 1;
		int number2 = right - mid;

		//indices
		int aIndex = left;
		int rIndex = 0;
		int lIndex = 0;

		//left array and right array creation
		int leftA[] = new int[number1];
		int rightA[] = new int[number2];

		//for loop left construction
		for (int i = 0; i < number1; i++)
		{
			leftA[i] = a[left + i];
		}//for

		//for loop right construction
		for (int j = 0; j < number2; j++)
		{
			rightA[j] = a[mid + 1 + j];
		}//for

		//while loop for "most of the elements"
		while (lIndex < number1 && rIndex < number2)
		{
			if (leftA[lIndex] <= rightA[rIndex])
			{
				a[aIndex] = leftA[lIndex];
				aIndex++;
				lIndex++;
			}//if

			else
			{
				a[aIndex] = rightA[rIndex];
				aIndex++;
				rIndex++;
			}//else
		}//while

		//adds whatever is missing from leftA
		while (lIndex < number1)
		{
			a[aIndex++] = leftA[lIndex++];
		}//while

		//adds whatever is missing from rightA
		while (rIndex < number2)
		{
			a[aIndex++] = rightA[rIndex++];
		}//while
	}//merge
}//class