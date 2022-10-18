package sort;

public class BubbleSortRecursive {
    public static void sort(int[] array, int length) {
        if (length == 1) {
            return;
        }

        boolean isSort = true;
        for (int i = 0; i < length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
                isSort = false;
            }
        }
        if (!isSort) {
            sort(array, length - 1);
        }
    }
}
