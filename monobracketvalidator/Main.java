package monobracketvalidator;

public class Main {
    public static void main(String[] args) {
        String[] stringArrayForChecking = {
                "(()()())",
                ")(",
                "(()",
                "((()))",
                "(((())",
                "()(",
                ""
        };

        for (String str : stringArrayForChecking) {
            System.out.println(MonoBracketValidator.isValidSequenceOfBrackets(str, '('));
        }
    }
}