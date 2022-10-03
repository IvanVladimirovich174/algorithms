import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Введите целое число n, размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        //BubbleSort
        int[] mBubbleSort = RandomArray.createRandomArray(n);
        System.out.println("Первоначальный массив: " + Arrays.toString(mBubbleSort));
        BubbleSort.sort(mBubbleSort);
        System.out.println("Отсортированный массив: " + Arrays.toString(mBubbleSort));

        System.out.println();

        //BubbleSortRecursive
        int[] mBubbleSortRecursive = RandomArray.createRandomArray(n);
        System.out.println("Первоначальный массив: " + Arrays.toString(mBubbleSortRecursive));
        BubbleSortRecursive.sort(mBubbleSortRecursive, n);
        System.out.println("Отсортированный массив: " + Arrays.toString(mBubbleSortRecursive));
    }
}
