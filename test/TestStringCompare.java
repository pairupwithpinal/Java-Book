import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestStringCompare {
    @Test
    public void testCompareStringh(){
        StringCompare stringcompare = new StringCompare();
        boolean actual_result = stringcompare.comparestring("Good Day","Good Day");
        String expected_Result = "Good Day";
        assertTrue(actual_result, expected_Result);
        System.out.println("Expected : "+ expected_Result +" Actual : "+actual_result);

    }

}

