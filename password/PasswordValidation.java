package password;

public class PasswordValidation {
    public static boolean validate(String password) {
        return password.matches("(?=.*\\d)(?=.*[a-z[а-яё]])(?=.*[A-Z[А-ЯЁ]])(?=.*[_\\-*]).{8,}");
    }
}