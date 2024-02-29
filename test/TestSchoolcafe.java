import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


    import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

    public class TestSchoolcafe {
        @Test
        public void test_deposit() {
            Schoolcafe schoolcafe = new Schoolcafe(0);
            schoolcafe.deposit(50);
            assertEquals(50, schoolcafe.balance);
            System.out.println("Expected balance is $50 " +"Actual balance is $"+schoolcafe.balance);
        }


        @Test
        public void test_withdraw() {
            Schoolcafe schoolcafe = new Schoolcafe(50);
            schoolcafe.withdraw(5);
            assertEquals(45, schoolcafe.balance);
            System.out.println("Expected balance is $45 " +"Actual balance is $"+schoolcafe.balance);
        }
    }



