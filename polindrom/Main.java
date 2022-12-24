package polindrom;

public class Main {
    public static void main(String[] args) {
        String sPolindrom = "ffgff";
        String isNotPolindrom = "aaabaab";

        System.out.println(PolindromChecking.isPolindrom(sPolindrom));
        System.out.println(PolindromChecking.isPolindrom(isNotPolindrom));
    }
}