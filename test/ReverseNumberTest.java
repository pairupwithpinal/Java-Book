import org.junit.*;

import static org.junit.Assert.assertEquals;

public class ReverseNumberTest {

    @Test
    public void testPositiveFiveDigitInteger()
    {
        int input = 12345;
        String inputStr = String.valueOf(input); // "12345"
        String reverseInputStr = String.valueOf(new StringBuilder(inputStr).reverse()); // "54321"

        NumberFlipper flipper = new NumberFlipper();
        int output = flipper.reverse(input);

        String outputStr = String.valueOf(output);

        System.out.println("Input:"+inputStr);
        System.out.println("Output:"+outputStr);

        assertEquals(reverseInputStr,outputStr);

    }

    @Test
    public void testWholeNegativeNumberOfThreeDigit()
    {
        int input = -234;
        String inputStr = "-234";
        String reverseInputStr = "-432";

        NumberFlipper flipper = new NumberFlipper();
        int output = flipper.reverse(input);

        String outputStr = String.valueOf(output);

        System.out.println("Expected:"+reverseInputStr);
        System.out.println("Actual:"+outputStr);

        assertEquals(reverseInputStr,outputStr);
    }


}
