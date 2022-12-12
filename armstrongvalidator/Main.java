package profilemodule.sixthhometaskadditional.task1;

public class Main {
    public static void main(String[] args) {
        int[] armstrongNumbers = new int[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9,
                153, 370, 371, 407,
                1634, 8208, 9474,
                54748, 92727, 93084,
                548834,
                1741725, 4210818, 9800817, 9926315,
                24678050, 24678051, 88593477,
                146511208, 472335975, 534494836, 912985153
        };

        for (int armstrongNumber : armstrongNumbers) {
            if (ArmstrongValidator.isArmstrongNumber(armstrongNumber)) {
                System.out.println("Number " + armstrongNumber + " is Armstrong's number");
            }
        }

        int[] notArmstrongNumbers = new int[]{
                0,
                10, 11, 12, 13, 14, 15,
                111, 155, 449,
                555555
        };

        for (int notArmstrongNumber : notArmstrongNumbers) {
            if (!ArmstrongValidator.isArmstrongNumber(notArmstrongNumber)) {
                System.out.println("Number " + notArmstrongNumber + " isn't Armstrong's number");
            }
        }
    }
}