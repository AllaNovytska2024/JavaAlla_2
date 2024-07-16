package lesson_43_Validator_Email;

import lesson_43_Validator_Email.validator.EmailValidateException;
import lesson_43_Validator_Email.validator.EmailValidator;

public class Person {
    private String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        try {
            EmailValidator.validateEmail(email);
            System.out.println("Email прошел проверку успешно!");
            this.email = email;
        } catch (EmailValidateException e) {
            System.out.println("Вы ввели некорректный email: " + e.getMessage());
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        try {
            if (isPasswordValid(password)) {
                this.password = password;
            } else {
                throw new PasswordValidateException("Пароль не соответствует требованиям.");
            }
        } catch (PasswordValidateException e) {
            System.out.println("Ошибка валидации пароля: " + e.getMessage());
        }
    }

    private boolean isPasswordValid(String password) {
        if (password == null || password.length() < 8) return false;
        boolean isDigit = false;
        boolean isLowerCase = false;
        boolean isUpperCase = false;
        boolean isSpecialSymbol = false;

        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) isDigit = true;
            if (Character.isLowerCase(ch)) isLowerCase = true;
            if (Character.isUpperCase(ch)) isUpperCase = true;
            if ("!%$@&*()[]".indexOf(ch) >= 0) isSpecialSymbol = true;
        }

        return isDigit && isLowerCase && isUpperCase && isSpecialSymbol;
    }
}

class PasswordValidateException extends Exception {
    public PasswordValidateException(String message) {
        super(message);
    }
}