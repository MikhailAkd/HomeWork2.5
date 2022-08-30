public class VerificationService {

    private VerificationService() {

    }

    public static boolean verification(String login, String password, String confirmPassword) {

        try {
            Check checker = new CheckSymbol();
            checkData(login, password, confirmPassword, checker);
            return true;
        } catch (WrongLoginException | WrongPasswordException a) {
            System.out.println(a.getMessage());
            return false;
        }
    }

    private static void checkData(String login, String password, String confirmPassword, Check checker) throws WrongLoginException, WrongPasswordException {

        if (login.length() > 20 || login == null) {
            throw new WrongLoginException("Длина логина не должна превышать 20 символов");
        }
        if (password.length() >= 20 || password == null || confirmPassword.length() >= 20 || confirmPassword == null) {
            throw new WrongLoginException("Длина пароля не должна превышать 19 символов");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли должны совпадать");
        }
        checker.checkLogin(login);
        checker.checkPassword(password);
    }
}
