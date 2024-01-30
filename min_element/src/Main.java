public class Main {
    public static void main(String[] args) {
        int[] arr = {25, 5, 67, 89, 55};
        int min = arr[0];
        int minIdx = -1;
        int max = arr[0];
        int maxIdx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIdx = i;
            }
            if (arr[i] > max) {
                max = arr[i];
                maxIdx = i;
            }
        }
        System.out.println(minIdx + " " + maxIdx);
        arr[minIdx] = arr[0];
        arr[0] = min;
        arr[maxIdx] = arr[arr.length - 1];
        arr[arr.length - 1] = max;
        for (int i : arr) {
            System.out.println(i);
        }
    }
}