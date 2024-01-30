import java.util.Scanner;

public class BestBubble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arrayAsc = new int[size];
        int[] arrayDsc = new int[size];
        for (int i = 0; i < size; i++) {
            arrayAsc[i] = scanner.nextInt();
            arrayDsc[i] = arrayAsc[i];
        }
        int a = bubbleSortAsc(arrayAsc, size);
        int b = bubbleSortDsc(arrayDsc, size);
        int result = Math.min(a, b);
        System.out.println(result);
    }

    static int bubbleSortAsc(int[] array, int size) {
        int ascCount = 0;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    ascCount++;
                }
            }
        }
        return ascCount;
    }
    static int bubbleSortDsc(int[] array, int size){
        int dscCount = 0;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    dscCount++;
                }
            }
        }
        return dscCount;
    }
}
