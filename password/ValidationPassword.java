package password;

public class ValidationPassword {
    public static boolean validate(String password) {
        return password.matches("(?=.*\\d)(?=.*[a-z[а-яё]])(?=.*[A-Z[А-ЯЁ]])(?=.*[_\\-*]).{8,}");
    }
}
