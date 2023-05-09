package fisheryatesshuffle;

import java.security.SecureRandom;

public class FisherYatesShuffler {
    public static int[] fisherYatesShuffler(int[] array) {
        SecureRandom sr = new SecureRandom();

        for (int i = array.length - 1; i > 0; --i) {
            int randomIndex = sr.nextInt(i + 1);
            int tmp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = tmp;
        }

        return array;
    }
}