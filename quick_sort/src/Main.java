public class Main {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5};
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr){
            System.out.println(i);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pid = partition(arr, low, high);
            quickSort(arr, low, pid - 1);
            quickSort(arr, pid + 1, high);
        }
    }
}