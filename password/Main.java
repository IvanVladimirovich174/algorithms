package password;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        char[] password = GenerationPassword.generate(n);

        for (char c : password) {
            System.out.print(c);
        }

        String passwordString = new String(password);
        System.out.println(ValidationPassword.validate(passwordString));
    }
}
