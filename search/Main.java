package search;

import sort.QuickSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите целое число n, размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arrayToSearch = RandomArray.createRandomArray(n);
        System.out.println("Первоначальный массив: " + Arrays.toString(arrayToSearch));
        QuickSort.sort(arrayToSearch);
        System.out.println("Отсортированный массив" + Arrays.toString(arrayToSearch));

        System.out.print("Введите целое число, которое необходимо найти: ");
        int key = scanner.nextInt();

        //LinearSearch
        int keyPositionLinearSearch = LinearSearch.linearSearch(arrayToSearch, key);
        System.out.println("[Линейный поиск]Индекс нахождения элемента в массиве: " + keyPositionLinearSearch);

        //BinarySearch
        int keyPositionBinarySearch = BinarySearch.binarySearch(arrayToSearch, key);
        System.out.println("[Бинарный поиск]Индекс нахождения элемента в массиве: " + keyPositionBinarySearch);
    }
}