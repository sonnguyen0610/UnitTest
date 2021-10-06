import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleAppTest {
    @Test
    void shouldShowHelloIUnit5() {
        String actual = SimpleApp.sayHello();
        String expected = "Hello Junit 5";
        Assertions.assertEquals(expected, actual);
    }

}
