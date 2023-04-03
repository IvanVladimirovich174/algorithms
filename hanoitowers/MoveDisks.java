package hanoitowers;

public class MoveDisks {
    public static void moveDisks(int n, char fromTower,
                                 char toTower, char auxTower) {
        if (n == 1) // простой случай
            System.out.println("Переместите диск " + n + " с " +
                    fromTower + " на " + toTower);
        else {
            moveDisks(n - 1, fromTower, auxTower, toTower);
            System.out.println("Переместите диск " + n + " с " +
                    fromTower + " на " + toTower);
            moveDisks(n - 1, auxTower, toTower, fromTower);
        }
    }
}