import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class simplecalculatorTest {
    simplecalculator calculator;
    @BeforeEach
    void setUP(){
        calculator = new simplecalculator();
    }

    @Test
    void test_if_caculator_add_is_working(){
        simplecalculator calculator = new simplecalculator();
       assertEquals( 22,calculator.addiction(10,12));
    }
    @Test
    void test_soustraction(){
        assertEquals(2,calculator.multiplication(3,1));
    }
    @Test
    void test_multiplication(){
        assertEquals(4,calculator.multiplication(2,2));
    }
    @Test
    void test_isEven(){
        assertTrue(calculator.isEven(4));
        assertTrue(calculator.isEven(5));
    }


}