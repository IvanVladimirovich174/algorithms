package fisheryatesshuffle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};

        System.out.println(Arrays.toString(FisherYatesShuffler.fisherYatesShuffler(array)));
    }
}