package password;

import java.security.SecureRandom;

public class GenerationPassword {

    public static char[] generate(int n) {

        final char[] SPECIAL_CHARS = {'*', '-', '_'};
        char[] pass = new char[n];
        SecureRandom sr = new SecureRandom();

        // fill pass with must have chars
        pass[0] = (char) sr.nextInt('a', 'z' + 1);
        pass[1] = (char) sr.nextInt('A', 'Z' + 1);
        pass[2] = (char) sr.nextInt('0', '9' + 1);
        pass[3] = SPECIAL_CHARS[sr.nextInt(SPECIAL_CHARS.length)];

        // fill rest with random chars
        for (int i = 4; i < n; i++) {
            char[] charVariants = {
                    (char) sr.nextInt('a', 'z' + 1),
                    (char) sr.nextInt('A', 'Z' + 1),
                    (char) sr.nextInt('0', '9' + 1),
                    SPECIAL_CHARS[sr.nextInt(SPECIAL_CHARS.length)]
            };
            pass[i] = charVariants[sr.nextInt(charVariants.length)];
        }

        // Fisher–Yates shuffle
        for (int i = n - 1; i > 0; i--) {
            int randomIndex = sr.nextInt(i + 1);
            char tmp = pass[i];
            pass[i] = pass[randomIndex];
            pass[randomIndex] = tmp;
        }

        return pass;
    }
}