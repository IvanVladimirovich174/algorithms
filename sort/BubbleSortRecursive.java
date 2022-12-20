package sort;

public class BubbleSortRecursive {
    public static void ascendingSort(int[] array, int length) {
        if (length == 1) {
            return;
        }

        boolean isSorted = true;
        for (int i = 0; i < length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
                isSorted = false;
            }
        }
        if (!isSorted) {
            ascendingSort(array, length - 1);
        }
    }

    public static void descendingSort(int[] array, int length) {
        if (length == 1) {
            return;
        }

        boolean isSorted = true;
        for (int i = 0; i < length - 1; i++) {
            if (array[i] < array[i + 1]) {
                int tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
                isSorted = false;
            }
        }
        if (!isSorted) {
            descendingSort(array, length - 1);
        }
    }
}