package MeothodOverloading;

import MeothodOverloading.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CalculatorTests {

    @Test
    void multiplyTwoValues(){
        assertEquals(6, Calculator.multiply(2.0, 3.0));
    }

    @Test
    void multiplyThreeValues(){
        assertEquals(6, Calculator.multiply(2.0, 3.0, 1.0));
    }

}
