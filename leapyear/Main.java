package leapyear;

public class Main {
    public static void main(String[] args) {
        int leapYearTest1 = 444;
        int leapYearTest2 = 1200;
        int isNotLeapYearTest1 = 333;
        int isNotLeapYearTest2 = 600;

        System.out.println(LeapYearChecking.isLeapYear(leapYearTest1));
        System.out.println(LeapYearChecking.isLeapYear(leapYearTest2));
        System.out.println(LeapYearChecking.isLeapYear(isNotLeapYearTest1));
        System.out.println(LeapYearChecking.isLeapYear(isNotLeapYearTest2));
    }
}
