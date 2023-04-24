package Test;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RockPaperScissorsGameTest {

    @Test
    public void testFunctionality() {
        int myNumber = 15;
        assertEquals(15, myNumber);
    }
}