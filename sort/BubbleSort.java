package sort;

public class BubbleSort {
    public static void ascendingSort(int[] array) {
        boolean isSorted;

        for (int i = 0; i < array.length - 1; i++) {
            isSorted = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
    }

    public static void desccendingSort(int[] array) {
        boolean isSorted;

        for (int i = 0; i < array.length - 1; i++) {
            isSorted = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
    }
}
