package sort;

import java.util.Arrays;

public class InsertionSort {
    public static void ascendingSort(int[] array) {
        System.out.println("Первоначальный массив: " + Arrays.toString(array));

        long startTime = System.nanoTime();

        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }

        long stopTime = System.nanoTime();

        System.out.println("Отсортированный массив в порядке возрастания [сортировка вставками]: " + Arrays.toString(array));
        System.out.println("Время сортировки заняло: " + (double) (stopTime - startTime) / 1_000_000_000);
        System.out.println();
    }

    public static void descendingSort(int[] array) {
        System.out.println("Первоначальный массив: " + Arrays.toString(array));

        long startTime = System.nanoTime();

        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && key > array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }

        long stopTime = System.nanoTime();

        System.out.println("Отсортированный массив в порядке возрастания [сортировка вставками]: " + Arrays.toString(array));
        System.out.println("Время сортировки заняло: " + (double) (stopTime - startTime) / 1_000_000_000);
        System.out.println();
    }
}