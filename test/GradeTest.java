import org.junit.*;

import static org.junit.Assert.assertEquals;


public class GradeTest {
    @Test
    public void NintyshouldReturnA() {

        SchoolGrade Result = new SchoolGrade();
        assertEquals("A Wonderful!", Result.Grade(90));
        System.out.println("Expected : AWonderful!  " + " Actual :" + Result.Grade(90));

    }

    @Test
    public void FortyTwoShouldReturnB() {
        SchoolGrade Result = new SchoolGrade();
        assertEquals("D ok", Result.Grade(42));
        System.out.println("Expected : D ok" + " Actual :" + Result.Grade(42));

    }

    @Test
    public void FiveShouldReturnTryAgain() {
        SchoolGrade Result = new SchoolGrade();
        assertEquals("Try Again", Result.Grade(5));
        System.out.println("Expected : Try Again " + " Actual : " + Result.Grade(5));

    }

    @Test
    public void NegativeShouldReturnInvalid() {
        SchoolGrade Result = new SchoolGrade();
        assertEquals("Invalid", Result.Grade(-20));
        System.out.println("Expected : Invalid " + " Actual : " + Result.Grade(-20));

    }

}