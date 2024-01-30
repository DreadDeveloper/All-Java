public class Main {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5};
        divide(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void conquer(int[] arr, int si, int mid, int ei) {
        int[] merged = new int[ei - si + 1];
        int i1 = si;
        int i2 = mid + 1;
        int x = 0;
        while (i1 <= mid && i2 <= ei) {
            if (arr[i1] < arr[i2]) {
                merged[x++] = arr[i1++];
            } else {
                merged[x++] = arr[i2++];
            }
        }
        while (i1 <= mid) {
            merged[x++] = arr[i1++];
        }
        while (i2 <= mid) {
            merged[x++] = arr[i2++];
        }
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }
}