public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        for(int e : solution.twoSum(nums, target))
        {
            System.out.println(e);
        }
    }
}