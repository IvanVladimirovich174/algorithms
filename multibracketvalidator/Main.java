package multibracketvalidator;

public class Main {
    public static void main(String[] args) {
        String[] stringArrayForChecking = {
                "{()[]()}",
                "{)(}",
                "[}",
                "[{(){}}][()]{}",
                "(",
                "[",
                "{",
                ""
        };

        for (String str : stringArrayForChecking) {
            System.out.println(MultiBracketValidator.isValidSequenceOfBrackets(str));
        }
    }
}