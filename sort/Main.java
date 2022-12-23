package sort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Введите целое число n, размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println();

        long startTime;
        long stopTime;

        // BubbleSort
        int[] mBubbleSort = RandomArray.createRandomArray(n);
        BubbleSort.ascendingSort(mBubbleSort);
        BubbleSort.descendingSort(mBubbleSort);

        // BubbleSortRecursive
        int[] mBubbleSortRecursive = RandomArray.createRandomArray(n);
        System.out.println("Первоначальный массив: " + Arrays.toString(mBubbleSortRecursive));

        startTime = System.nanoTime();
        BubbleSortRecursive.ascendingSort(mBubbleSortRecursive, n);
        stopTime = System.nanoTime();
        System.out.println("Отсортированный массив в порядке возрастания [сортировка пузырьком рекурсивно]: " + Arrays.toString(mBubbleSortRecursive));
        System.out.println("Время сортировки заняло: " + (double) (stopTime - startTime) / 1_000_000_000);
        System.out.println();

        System.out.println("Первоначальный массив: " + Arrays.toString(mBubbleSortRecursive));
        startTime = System.nanoTime();
        BubbleSortRecursive.descendingSort(mBubbleSortRecursive, n);
        stopTime = System.nanoTime();
        System.out.println("Отсортированный массив в порядке убывания [сортировка пузырьком рекурсивно]: " + Arrays.toString(mBubbleSortRecursive));
        System.out.println("Время сортировки заняло: " + (double) (stopTime - startTime) / 1_000_000_000);
        System.out.println();

        // SelectionSort
        int[] mSelectionSort = RandomArray.createRandomArray(n);
        SelectionSort.sort(mSelectionSort);

        // SelectionSortRecursive
        int[] mSelectionSortRecursive = RandomArray.createRandomArray(n);
        System.out.println("Первоначальный массив: " + Arrays.toString(mSelectionSortRecursive));

        startTime = System.nanoTime();
        SelectionSortRecursive.sort(mSelectionSortRecursive, 0, n);
        stopTime = System.nanoTime();
        System.out.println("Отсортированный массив в порядке возрастания: " + Arrays.toString(mSelectionSortRecursive));
        System.out.println("Время сортировки заняло: " + (double) (stopTime - startTime) / 1_000_000_000);
        System.out.println();

        // InsertionSort
        int[] mInsertionSort = RandomArray.createRandomArray(n);
        System.out.println("Первоначальный массив: " + Arrays.toString(mInsertionSort));

        startTime = System.nanoTime();
        InsertionSort.ascendingSort(mInsertionSort);
        stopTime = System.nanoTime();
        System.out.println("Отсортированный массив в порядке возрастания: " + Arrays.toString(mInsertionSort));
        System.out.println("Время сортировки заняло: " + (double) (stopTime - startTime) / 1_000_000_000);
        System.out.println();

        startTime = System.nanoTime();
        InsertionSort.descendingSort(mInsertionSort);
        stopTime = System.nanoTime();
        System.out.println("Отсортированный массив в порядке убывания: " + Arrays.toString(mInsertionSort));
        System.out.println("Время сортировки заняло: " + (double) (stopTime - startTime) / 1_000_000_000);
        System.out.println();

        // QuickSort
        int[] mQuickSort = RandomArray.createRandomArray(n);
        System.out.println("Первоначальный массив: " + Arrays.toString(mQuickSort));

        startTime = System.nanoTime();
        QuickSort.sort(mQuickSort);
        stopTime = System.nanoTime();
        System.out.println("Отсортированный массив в порядке возрастания: " + Arrays.toString(mQuickSort));
        System.out.println("Время сортировки заняло: " + (double) (stopTime - startTime) / 1_000_000_000);
        System.out.println();

        // RadixSort
        int[] mRadixSort = RandomArray.createRandomArray(n);
        System.out.println("Первоначальный массив: " + Arrays.toString(mRadixSort));

        startTime = System.nanoTime();
        RadixSort.radixSort(mRadixSort);
        stopTime = System.nanoTime();
        System.out.println("Отсортированный массив в порядке возрастания: " + Arrays.toString(mRadixSort));
        System.out.println("Время сортировки заняло: " + (double) (stopTime - startTime) / 1_000_000_000);
        System.out.println();
    }
}