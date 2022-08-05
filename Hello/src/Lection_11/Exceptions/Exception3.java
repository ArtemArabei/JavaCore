package Lection_11.Exceptions;

public class Exception3 {
    void validateRegistration(String login, String password, String
            confirmPassword) throws NullFieldsException, SizeFieldsException,
            ValidationFiledException, PasswordNotConfirmException {
        if (login == null || password == null || confirmPassword == null) {
            throw new NullFieldsException("Пустое поле");
        }
        if (login.length() > 20 || password.length() > 20 ||
        confirmPassword.length() > 20) {
            throw new SizeFieldsException("Длина больше 20");
        }
        if (!login.matches("[a-zA-Z0-9_]+") ||
                !password.matches("[a-zA-Z0-9_]+")) {
            throw new ValidationFiledException("Невалидные символы");
        }
        if (!password.equals(confirmPassword)) {
            throw new PasswordNotConfirmException("Не совпадает пароль с " +
                    "подтверждением");
        }
    }

    public static void main(String[] args) {
        Exception3 test2 = new Exception3();
        try {
            test2.validateRegistration(null, "12345", "12345");
        } catch (NullFieldsException e) {
            e.printStackTrace();
        } catch (SizeFieldsException e) {
            e.printStackTrace();
        } catch (ValidationFiledException e) {
            e.printStackTrace();
        } catch (PasswordNotConfirmException e) {
            e.printStackTrace();
        }
    }
}
