package sort;

public class InsertionSortRecursive {
    public static void ascendingSort(int[] array, int low, int high) {
        if (low < high - 1) {
            int key = array[low];
            int j = low;
            while (j >= 0 && key < array[j + 1]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;

            ascendingSort(array, low + 1, high);
        }
    }

    public static void descendingSort(int[] array, int low, int high) {
        if (low < high - 1) {
            int key = array[low];
            int j = low;
            while (j >= 0 && key < array[j + 1]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;

            ascendingSort(array, low + 1, high);
        }
    }
}