public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        //solution.maxArea(/*Enter any non negative interger array.*/);
    }
}
class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int startPointer = 0;
        int lastPointer = height.length - 1;
        while(startPointer < lastPointer) {
            if(height[startPointer] < height[lastPointer]) {
                maxArea = Math.max(maxArea, height[startPointer] * (lastPointer - startPointer));
                startPointer++;
            }
            else {
                maxArea = Math.max(maxArea, height[lastPointer] * (lastPointer - startPointer));
                lastPointer--;
            }
        }
        return maxArea;
    }
}