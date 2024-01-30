import java.util.Arrays;

public class Sort
{
	int size;
	byte i, j;
	Sort(int size)
	{
		this.size = size;
	}
	public void bubbleSort(int[] arr)
	{
		int temp;
		for(i = 0; i < size; i++)
		{
			for(j = 1; j < (size - i); j++)
			{
				if(arr[j-1] > arr[j])
				{
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
