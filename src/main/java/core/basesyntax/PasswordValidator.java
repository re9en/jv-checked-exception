package core.basesyntax;

public class PasswordValidator {
    private UserService userService = new UserService();

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password.length() <= 10 && !repeatPassword.equals(password)) {
            throw new PasswordValidationException("Wrong passwords");
        }

    }
}
