package sort;

public class RadixSort {
    public static void radixSort(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        int[] counters = new int[max + 1];
        for (int i = 0; i < array.length; ++i) {
            counters[array[i]] += 1;
        }

        int idx = 0;
        for (int i = 0; i < counters.length; ++i) {
            for (int j = 0; j < counters[i]; ++j) {
                array[idx] = i;
                ++idx;
            }
        }
    }
}