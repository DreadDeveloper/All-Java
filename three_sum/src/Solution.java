import java.util.*;
public class Solution
{
    public List<List<Integer>> threeSum(int[] nums)
    {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        int j, k;
        for(int i = 0; i < nums.length - 2; i++)
        {
            j = i + 1;
            k = nums.length - 1;
            while(j < k)
            {
                if(nums[i] + nums[j] + nums[k] == 0)
                {

                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    set.add(list);
                    j++;
                }
                else if(nums[i] + nums[j] + nums[k] < 0)
                {
                    j++;
                }
                else
                {
                    k--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}