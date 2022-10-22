package polindrom;

public class PolindromChecking {
    public static boolean isPolindrom(String s) {
        int low = 0;
        int height = s.length() - 1;

        while (low < height) {
            if(s.charAt(low) != s.charAt(height)) {
                return false;
            }
            low++;
            height--;
        }
        return true;
    }
}
