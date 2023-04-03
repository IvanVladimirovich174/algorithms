package hanoitowers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите количество дисков: ");
        int n = input.nextInt();

        System.out.println("Алгоритм:");
        MoveDisks.moveDisks(n, 'A', 'C', 'B');
    }
}