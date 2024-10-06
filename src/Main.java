import exception.WrongLoginException;
import exception.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        String login = "java_skypro_go";
        String password = "D_1hWiKjjP_9";
        String confirmPassword = "D_1hWiKjjP_9";


        try {
            User.authoriseUser(login, password, confirmPassword);
        } catch (WrongLoginException wrongLoginException) {
            System.out.println("Произошла ошибка при проверке логина: " + wrongLoginException.getMessage());
        } catch (WrongPasswordException wrongPasswordException) {
            System.out.println("Произошла ошибка при проверке пароля: " + wrongPasswordException.getMessage());
        } finally {
            System.out.println("Авторизация завершена!");
        }

    }
}