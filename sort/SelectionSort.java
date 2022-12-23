package sort;

import java.util.Arrays;

public class SelectionSort {
    public static void sort(int[] array) {
        System.out.println("Первоначальный массив: " + Arrays.toString(array));

        long startTime = System.nanoTime();

        int minIndex;

        for (int i = 0; i < array.length - 1; i++) {
            minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int tmp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = tmp;
            }
        }

        long stopTime = System.nanoTime();

        System.out.println("Отсортированный массив в порядке убывания [сортировка выбором]: " + Arrays.toString(array));
        System.out.println("Время сортировки заняло: " + (double) (stopTime - startTime) / 1_000_000_000);
        System.out.println();
    }
}