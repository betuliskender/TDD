import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingsTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void greet() {
        String actual = new Greetings().greet("Bob");
        String expected = "Hello Bob";
        assertEquals(expected, actual);
    }

    @Test
    void nullInput() {
        String actual = new Greetings().greet(null);
        String expected = "Hello, my friend";
        assertEquals(expected,actual);
    }

    @Test
    void upperCase(){
        String actual = new Greetings().greet("BOB");
        String expected = "HELLO BOB!";
        assertEquals(expected, actual);
    }

    @Test
    void moreNames(){
        String[] names = {"Jill", "Bob", "James"};

        String actual = new Greetings().greet(names);
        String expected = "Hello Jill, Bob, James";
        assertEquals(expected, actual);

    }
}