public class Solution
{
    public boolean anagram(String s, String t)
    {
        int[] frequency = new int[26];
        if(s.length() != t.length())
        {
            return false;
        }
        for(char c : s.toCharArray())
        {
            frequency[c - 'a']++;
        }
        for(char c : t.toCharArray())
        {
            frequency[c - 'a']--;
        }
        for(int i : frequency)
        {
            if(i != 0)
            {
                return false;
            }
        }
        return true;
    }
}
