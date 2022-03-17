package MehtodOverriding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest {
    Multiplication sum = new Multiplication(1.0,8.0);
    @Test
    void multiply() {
        assertEquals(8,sum.multiply());
    }
}