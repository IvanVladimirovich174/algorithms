package sort;

import java.util.Arrays;

public class BubbleSort {
    public static void ascendingSort(int[] array) {
        System.out.println("Первоначальный массив: " + Arrays.toString(array));

        long startTime = System.nanoTime();

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

        long stopTime = System.nanoTime();

        System.out.println("Отсортированный массив в порядке возрастания: " + Arrays.toString(array));
        System.out.println("Время сортировки заняло: " + (double) (stopTime - startTime) / 1_000_000_000);
    }

    public static void descendingSort(int[] array) {
        System.out.println("Первоначальный массив: " + Arrays.toString(array));

        long startTime = System.nanoTime();

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

        long stopTime = System.nanoTime();

        System.out.println("Отсортированный массив в порядке убывания: " + Arrays.toString(array));
        System.out.println("Время сортировки заняло: " + (double) (stopTime - startTime) / 1_000_000_000);
    }
}