import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Test calculator")
class CalculatorTest {

    @Test
    @DisplayName("Should equal 5")
    void shouldEqual5() {
        double actual = Calculator.add(2, 3);
        double expected = 5f;
        assertEquals(expected, actual);
    }


}