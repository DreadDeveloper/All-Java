public class Solution
{
    public boolean isPalindrome(String s)
    {
        if(s.isEmpty())
        {
            return true;
        }
        int i, j;
        for(i = 0, j = s.length() - 1; i < j;)
        {
            if(!Character.isLetterOrDigit(s.charAt(i)))
            {
                i++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(j)))
            {
                j--;
            }
            else
            {
                if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
                {
                    return false;
                }
                i++; j--;
            }
        }
        return true;
    }
}