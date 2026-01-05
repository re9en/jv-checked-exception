package core.basesyntax;

public class Main {
    public static void main(String[] args) throws PasswordValidationException {
        User user = new User("regen69neger@gmail.com", " ", "1234567891");
        UserService userService = new UserService();
        userService.registerUser(user);
    }
}
