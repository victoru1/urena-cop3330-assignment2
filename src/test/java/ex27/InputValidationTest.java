package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputValidationTest {

    @Test
    void validateFirstName() {
        assertAll(()->assertEquals(true, InputValidation.validateFirstName("John")),()->assertEquals(false, InputValidation.validateFirstName("J")), ()->assertEquals(false, InputValidation.validateFirstName("")));
    }

    @Test
    void validateLastName() {
        assertAll(()->assertEquals(true, InputValidation.validateLastName("Johnson")),()->assertEquals(false, InputValidation.validateLastName("J")), ()->assertEquals(false, InputValidation.validateLastName("")));
    }

    @Test
    void validateZipCode() {
        assertAll(()->assertEquals(true, InputValidation.validateZipCode("55555")),()->assertEquals(false, InputValidation.validateZipCode("ABCDE")), ()->assertEquals(false, InputValidation.validateZipCode("1234")));
    }

    @Test
    void validateEmployeeID() {
        assertAll(()->assertEquals(true, InputValidation.validateEmployeeID("TK-4321")),()->assertEquals(false, InputValidation.validateEmployeeID("A12-1234")));
    }
}