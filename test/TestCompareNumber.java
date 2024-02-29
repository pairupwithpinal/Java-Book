import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestCompareNumber {


    @Test
    public void compareTwoNumber() {
        Comparator number = new Comparator();
        // int comparenumber = number.compare(20, 25);
        int expected_num = 25;
        assertEquals(expected_num, number.compare(20, 25));
        System.out.println("expected : " + expected_num + ".....  and.....  actual " + number.compare(20, 25));
    }

    @Test
    public void compareTwoNegativeNumber() {
        Comparator comparator = new Comparator();
        int expected_num = -5;
        assertEquals(expected_num, comparator.compare(-5, -10));
        System.out.println("expected : " + expected_num + "......  and..... actual " + comparator.compare(-5, -10));
    }
}


