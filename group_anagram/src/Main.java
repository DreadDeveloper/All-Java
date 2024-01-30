import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
//      solution.groupAnagrams(/*Send any list of lists of strings.*/);
    }
}
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            if(!map.containsKey(sorted)) {
                map.put(sorted, new LinkedList<String>());
            }
            map.get(sorted).add(str);
        }
        return new LinkedList<>(map.values());
    }
}