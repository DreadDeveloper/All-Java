public class Solution
{
    public int findMin(int[] nums)
    {
        int first = 0;
        int last = nums.length - 1;
        int mid;
        while(first < last)
        {
            mid = (first + last) / 2;
            if(mid > 0 && nums[mid] < nums[mid - 1])
            {
                return nums[mid];
            }
            else if(nums[mid] > nums[mid + 1])
            {
                return nums[mid + 1];
            }
            if(nums[mid] > nums[first] && nums[mid] > nums[last])
            {
                first = mid + 1;
            }
            else
            {
                last = mid - 1;
            }
        }
        return nums[first];
    }
}