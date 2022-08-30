public class CheckSymbol implements Check {

    private static final String validSymbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";

    @Override
    public void checkLogin(String login) throws WrongLoginException {
        for (int i = 0; i < login.length(); i++) {
            if (!validSymbols.contains(String.valueOf(login.charAt(i)))) {
                throw new WrongLoginException("Логин содержит запрещённый символ: " + login.charAt(i));
            }
        }
    }

    @Override
    public void checkPassword(String password) throws WrongPasswordException {
        for (int i = 0; i < password.length(); i++) {
            if (!validSymbols.contains(String.valueOf(password.charAt(i)))) {
                throw new WrongPasswordException("Пароль содержит запрещённый символ: " + password.charAt(i));
            }
        }
    }
}
