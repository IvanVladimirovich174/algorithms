package sort;

import java.util.concurrent.ThreadLocalRandom;

public class RandomArray {
    public static int[] createRandomArray(int n) {
        int[] m = new int[n];

        for (int i = 0; i < n; i++) {
            m[i] = ThreadLocalRandom.current().nextInt(0, 1001);
        }

        return m;
    }
}