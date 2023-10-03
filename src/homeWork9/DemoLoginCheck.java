package homeWork9;

public class DemoLoginCheck {
    public static void main(String[] args) {
        try {
            System.out.println(LoginCheck.isSignedUp("tesatqwertyuiopasdf", "test11", "test11"));
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
        }

    }
}
