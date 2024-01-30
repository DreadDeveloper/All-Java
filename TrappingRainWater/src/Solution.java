import java.util.Stack;
public class Solution
{
    public String removeStars(String s)
    {
        StringBuilder stringBuilder = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray())
        {
            if(c == '*')
            {
                stack.pop();
            }
            else
            {
                stack.push(c);
            }
        }
        for(char c : stack)
        {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
