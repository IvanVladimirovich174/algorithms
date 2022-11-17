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

        //BubbleSort
        int[] mBubbleSort = RandomArray.createRandomArray(n);
        System.out.println("Первоначальный массив: " + Arrays.toString(mBubbleSort));

        startTime = System.nanoTime();
        BubbleSort.ascendingSort(mBubbleSort);
        stopTime = System.nanoTime();
        System.out.println("Отсортированный массив в порядке возрастания: " + Arrays.toString(mBubbleSort));
        System.out.println("Время сортировки заняло: " + (double) (stopTime - startTime) / 1_000_000_000);

        startTime = System.nanoTime();
        BubbleSort.descendingSort(mBubbleSort);
        stopTime = System.nanoTime();
        System.out.println("Отсортированный массив в порядке убывания: " + Arrays.toString(mBubbleSort));
        System.out.println("Время сортировки заняло: " + (double) (stopTime - startTime) / 1_000_000_000);
        System.out.println();

        //BubbleSortRecursive
        int[] mBubbleSortRecursive = RandomArray.createRandomArray(n);
        System.out.println("Первоначальный массив: " + Arrays.toString(mBubbleSortRecursive));

        startTime = System.nanoTime();
        BubbleSortRecursive.ascendingSort(mBubbleSortRecursive, n);
        stopTime = System.nanoTime();
        System.out.println("Отсортированный массив в порядке возрастания: " + Arrays.toString(mBubbleSortRecursive));
        System.out.println("Время сортировки заняло: " + (double) (stopTime - startTime) / 1_000_000_000);

        startTime = System.nanoTime();
        BubbleSortRecursive.descendingSort(mBubbleSortRecursive, n);
        stopTime = System.nanoTime();
        System.out.println("Отсортированный массив в порядке убывания: " + Arrays.toString(mBubbleSortRecursive));
        System.out.println("Время сортировки заняло: " + (double) (stopTime - startTime) / 1_000_000_000);
        System.out.println();

        //SelectionSort
        int[] mSelectionSort = RandomArray.createRandomArray(n);
        System.out.println("Первоначальный массив: " + Arrays.toString(mSelectionSort));

        startTime = System.nanoTime();
        SelectionSort.sort(mSelectionSort);
        stopTime = System.nanoTime();
        System.out.println("Отсортированный массив в порядке возрастания: " + Arrays.toString(mSelectionSort));
        System.out.println("Время сортировки заняло: " + (double) (stopTime - startTime) / 1_000_000_000);
        System.out.println();

        //SelectionSortRecursive
        int[] mSelectionSortRecursive = RandomArray.createRandomArray(n);
        System.out.println("Первоначальный массив: " + Arrays.toString(mSelectionSortRecursive));

        startTime = System.nanoTime();
        SelectionSortRecursive.sort(mSelectionSortRecursive, 0, n);
        stopTime = System.nanoTime();
        System.out.println("Отсортированный массив в порядке возрастания: " + Arrays.toString(mSelectionSortRecursive));
        System.out.println("Время сортировки заняло: " + (double) (stopTime - startTime) / 1_000_000_000);
        System.out.println();

        //InsertionSort
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

        //QuickSort
        int[] mQuickSort = RandomArray.createRandomArray(n);
        System.out.println("Первоначальный массив: " + Arrays.toString(mQuickSort));

        startTime = System.nanoTime();
        QuickSort.sort(mQuickSort);
        startTime = System.nanoTime();
        System.out.println("Отсортированный массив в порядке возрастания: " + Arrays.toString(mQuickSort));
        System.out.println("Время сортировки заняло: " + (double) (stopTime - startTime) / 1_000_000_000);
        System.out.println();
    }
}
