package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void passwordValidator() {
        assertAll(()->assertEquals("The password 'abcdef' is a weak password.", PasswordValidator.passwordValidator("abcdef")),()->assertEquals("The password '12345' is a very weak password.", PasswordValidator.passwordValidator("12345")),()->assertEquals("The password 'abc123xyz' is a strong password.", PasswordValidator.passwordValidator("abc123xyz")),()->assertEquals("The password '1337h@xor' is a very strong password.", PasswordValidator.passwordValidator("1337h@xor")));
    }
}