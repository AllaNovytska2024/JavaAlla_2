package validation;

import java.util.regex.Pattern;
/*
public class ValidationEmailAndPassword {

public static boolean validateEmail(String email) {
    User user = userRepository.addUser(name, email, password);

    String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$";

}
        return Pattern.compile(regexPattern).matcher(email).matches();
//  return user;

    }
        /*
        Коммент к валидации эмайл:
        Ограничения для локальной части email-адреса:
          -Разрешены цифры от 0 до 9.
          -Разрешены буквы в верхнем и нижнем регистре от a до z.
          -Разрешены символы “_”, “-”, и “.”.
          -Точка не разрешена в начале и конце локальной части.
          -Не разрешены последовательные точки.
          -Ограничения для доменной части:
          -Разрешены цифры от 0 до 9.
          -Разрешены буквы в верхнем и нижнем регистре от a до z.
          -Тире “-” и точка “.” не разрешены в начале и конце доменной части.
          -Нет последовательных точек.

//TODO (Alla) Добавить валидация email(выше над этой строкой сделано),password, name

// Валидация name:

public class NameValidation {

    String name = "John"; // Пример имени
    boolean isValidName = name.matches("^[A-Z][a-zA-Z]*$");{
        boolean result = true;
        return name
    }
    // Это регулярное выражение проверяет, что имя начинается с большой буквы и содержит только буквы
}
public class PasswordValidation {
    Password password = new Password(String password) {
        boolean result true;
        boolean isValidPassword = password.matches("^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[@#$%^&*!])[A-Za-z\\d@#$%^&*!]{8,}$");
        //Это регулярное выражение проверяет, что пароль содержит
        // как минимум одну букву, одну цифру и один специальный символ, и имеет длину не менее 8 символов
    }
}

*/