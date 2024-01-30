import java.util.Stack;
public class Solution
{
    public boolean isValid(String s)
    {
        Stack<Character> characterStack = new Stack<>();
        for(char c : s.toCharArray())
        {
            if (c == '(' || c == '{' || c == '[')
            {
                characterStack.push(c);
            }
            else
            {
                if (characterStack.isEmpty())
                {
                    return false;
                }
                if (c == ')' && characterStack.peek() == '(')
                {
                    characterStack.pop();
                }
                else if (c == '}' && characterStack.peek() == '{')
                {
                    characterStack.pop();
                }
                else if (c == ']' && characterStack.peek() == '[')
                {
                    characterStack.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        return characterStack.isEmpty();
    }
}