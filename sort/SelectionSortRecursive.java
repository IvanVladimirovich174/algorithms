package sort;

public class SelectionSortRecursive {
    public static void sort(int[] array, int low, int high) {
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

            sort(array, low + 1, high);
        }
    }
}
