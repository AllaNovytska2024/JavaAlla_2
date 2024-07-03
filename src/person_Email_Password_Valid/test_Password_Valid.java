package person_Email_Password_Valid;

import lesson_26_Persons.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class test_Password_Valid {

        Person person;
        String startEmail = "john@test.com";
        String startPassword = "qwerty1Q$";

        @BeforeEach
        void setUp() {
            person = new Person(startEmail, startPassword);
        }

        @Test
        void testValidPassword() {
            String validPassword = "qwertyOOOO1Q$"; // меняем startPassword = "qwerty1Q$" пароль и смотрим на консоль, заменился он или нет
            // 9 ;
            System.out.println("getPassword before: " + person.getPassword());

            person.setPassword(validPassword);

            System.out.println("getPassword after: " + person.getPassword());
            Assertions.assertEquals(validPassword, person.getPassword());
        }

        @ParameterizedTest
        @MethodSource("invalidPasswordData")
        void testSetInvalidPassword(String invalidPassword) {
            person.setPassword(invalidPassword);

            Assertions.assertEquals(startPassword, person.getPassword());
            Assertions.assertNotEquals(invalidPassword, person.getPassword());
        }

        static Stream<String> invalidPasswordData() {
            return Stream.of(
                    "qweгtу1Q$",
                    "tesQQQQQQQ",
                    "testtsttesttest",
                    "test.ne.t1Q?",
                    "test@email.net.",
                    "tesRTYet",
                    "test",
                    "t ",
                    "t",
                    "",
                    "tes?!+%&",
                    "@@@Кemailnet",
                    "qwertу1Q$",
                    "qweгty1Q$"
            );
        }

    }



