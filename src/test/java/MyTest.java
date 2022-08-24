import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {


    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void greetingTest(){
        System.out.println("First test of method");
        String actual = new Greetings().sayHello();
        String expected = "Hello";
        assertEquals(expected, actual);
    }
}
