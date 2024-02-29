import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPythagorean {

    @Test
    public void testPositiveNumber() {
        Pythagorean tri1 = new Pythagorean();

        int actual_ans = tri1.multiply(5, 5);
        int expected_ans = 50;
        assertEquals(expected_ans, actual_ans);
        System.out.println("expected : " + expected_ans + " actual " + tri1.multiply(5, 5));
    }
}

