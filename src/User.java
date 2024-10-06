import exception.WrongLoginException;
import exception.WrongPasswordException;

import java.util.regex.Pattern;

public class User {

    private final static Pattern LOGIN_PATTERN = Pattern.compile("[a-zA-Z0-9_]{1,20}");
    private final static Pattern PASSWORD_PATTERN = Pattern.compile("[a-zA-Z0-9_]{1,20}");

    public static void authoriseUser(String login, String password, String confirmPassword){
        checkLogin(login);
        checkPassword(password, confirmPassword);
    }

    private static void checkLogin(String login) {
        if (!LOGIN_PATTERN.matcher(login).matches()) {
            throw new WrongLoginException("Логин введен некорректно!");
        }
    }

    private static void checkPassword(String password, String confirmPassword) {
        if (!PASSWORD_PATTERN.matcher(password).matches()) {
            throw new WrongPasswordException("Пароль введен некорректно!");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Неверный пароль");
        }

    }

}
