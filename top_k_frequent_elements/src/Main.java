import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] topKFrequent = new int[k];
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!frequencyMap.containsKey(nums[i])) {
                frequencyMap.put(nums[i], frequencyMap.getOrDefault(i, 0) + 1);
            }
        }
        PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        for (Map.Entry entry : frequencyMap.entrySet()){
            priorityQueue.add(entry);
        }
        for (int i = 0; i < k; i++){
            topKFrequent[i] = priorityQueue.poll().getKey();
        }
        return topKFrequent;
    }
}