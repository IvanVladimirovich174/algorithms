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
        SelectionSort.sort(mSelectionSort);
        System.out.println("Отсортированный массив: " + Arrays.toString(mSelectionSort));
        System.out.println();

        //SelectionSortRecursive
        int[] mSelectionSortRecursive = RandomArray.createRandomArray(n);
        System.out.println("Первоначальный массив: " + Arrays.toString(mSelectionSortRecursive));
        SelectionSortRecursive.sort(mSelectionSortRecursive, 0, n);
        System.out.println("Отсортированный массив: " + Arrays.toString(mSelectionSortRecursive));
        System.out.println();

        //InsertionSort
        int[] mInsertionSort = RandomArray.createRandomArray(n);
        System.out.println("Первоначальный массив: " + Arrays.toString(mInsertionSort));
        InsertionSort.ascendingSort(mInsertionSort);
        System.out.println("Отсортированный массив в порядке возрастания: " + Arrays.toString(mInsertionSort));
        InsertionSort.descendingSort(mInsertionSort);
        System.out.println("Отсортированный массив в порядке убывания: " + Arrays.toString(mInsertionSort));
        System.out.println();

        //QuickSort
        int[] mQuickSort = RandomArray.createRandomArray(n);
        System.out.println("Первоначальный массив: " + Arrays.toString(mQuickSort));
        QuickSort.sort(mQuickSort);
        System.out.println("Отсортированный массив: " + Arrays.toString(mQuickSort));
        System.out.println();
    }
}
