package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramCheckerTest {

    @Test
    void isAnagram() {
        assertAll(()->assertEquals(true, AnagramChecker.isAnagram("note","tone")),()->assertEquals(false, AnagramChecker.isAnagram("note","form")));
    }
}