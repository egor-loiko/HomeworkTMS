package homeWork9;

public class LoginCheck {
    private static String login;
    private static String password;
    private static String confirmPassword;

    private static boolean isPasswordContainsDigits(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSignedUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() < 20 && !login.contains(" ")) {
            System.out.println("Login is correct");
            if (password.length() < 20 && !password.contains(" ") && isPasswordContainsDigits(password)) {
                System.out.println("Password is correct");
                if (password.equals(confirmPassword)) {
                    System.out.println("Passwords match");
                    return true;
                } else {
                    System.out.println("Passwords don't match");
                    throw new WrongPasswordException("Password and confirm Password don't match");
                }
            } else {
                System.out.println("Password is incorrect");
                throw new WrongPasswordException("Password doesn't correspond to requirements");
            }
        } else {
            System.out.println("Login is incorrect");
            throw new WrongLoginException("Login doesn't correspond to requirements");
        }
    }
}
