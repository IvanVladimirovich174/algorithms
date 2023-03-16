package sort;

public class SelectionSortRecursive {
    public static void ascendingSort(int[] array, int low, int high) {
        if (low < high - 1) {
            int minIndex = low;
            for (int i = low; i < high; i++) {
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
            }

            if (minIndex != low) {
                int tmp = array[minIndex];
                array[minIndex] = array[low];
                array[low] = tmp;
            }

            ascendingSort(array, low + 1, high);
        }
    }

    public static void descendingSort(int[] array, int low, int high) {
        if (low < high - 1) {
            int maxIndex = low;
            for (int i = low; i < high; i++) {
                if (array[i] > array[maxIndex]) {
                    maxIndex = i;
                }
            }

            if (maxIndex != low) {
                int tmp = array[maxIndex];
                array[maxIndex] = array[low];
                array[low] = tmp;
            }

            descendingSort(array, low + 1, high);
        }
    }
}