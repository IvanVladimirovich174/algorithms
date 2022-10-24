package search;

import sort.RandomArray;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите целое число n, размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] binarySearch = RandomArray.createRandomArray(n);
        System.out.println("Первоначальный массив: " + Arrays.toString(binarySearch));

        System.out.print("Введите целое число, которое необходимо найти: ");
        int key = scanner.nextInt();

        int keyPosition = BinarySearch.binarySearch(binarySearch, key);
        System.out.println("Индекс нахождения элемента в массиве: " + keyPosition);
    }
}
