public class BubbleSort {
    public static void sort(int[] array) {

        boolean isSort;

        for (int i = 0; i < array.length - 1; i++) {
            isSort = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    isSort = false;
                }
            }

            if (isSort) {
                break;
            }
        }
    }
}
