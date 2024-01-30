public class Solution
{
    public int maxSubArray(int[] nums)
    {
        int i = 0, sum = 0, maximum = Integer.MIN_VALUE;
        while(i < nums.length)
        {
            if(sum < 0 && nums[i] >= sum)
            {
                sum = 0;
            }
            sum += nums[i];
            maximum = Math.max(sum, maximum);
            i++;
        }
        return maximum;
    }
}
