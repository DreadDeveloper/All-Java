import java.util.Arrays;
public class Solution
{
    public int distribution(int[] arr, int students)
    {
        int minimum = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length - students + 1; i++)
        {
            if(arr[i + students - 1] - arr[i] < minimum)
            {
                minimum = arr[i + students - 1] - arr[i];
            }
        }
        return minimum;
    }
}
