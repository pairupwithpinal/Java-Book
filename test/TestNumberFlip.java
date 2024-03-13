import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNumberFlip {
    @Test
    public void test_Positve_Number(){
        NumberFlipper num1= new NumberFlipper();
        int Actual_num1 = num1.reverse(234);
        int Expected_num  = 432;
        assertEquals(Expected_num,Actual_num1);
        System.out.println("Expected num is " + Expected_num + " we give input 234 and actual output is : " +Actual_num1);
    }


    }

