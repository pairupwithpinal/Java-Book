import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestReverseNo {
    @Test
    public  void test_positive_number(){
        ReverseNo num1 = new ReverseNo();
        int Actual_output = num1.getReverse_num(5678);
        int Expected_output = 8765;
        assertEquals(Expected_output,Actual_output);
        System.out.println("expected_output is : " + Expected_output + ".....  and.....  actua_output is " + Actual_output);

    }
}
