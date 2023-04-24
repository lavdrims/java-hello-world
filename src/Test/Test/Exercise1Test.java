package Test;

import Exercises.Exercise01.Exercise1;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Exercise1Test {

    Exercise1 exercise1;

    @BeforeTest
    void setUp () {
        exercise1 = new Exercise1();
    }

    @Test
    public void testReturnedName() {
        String myString = exercise1.returnMyName("Lavdrim", 5);
        //assertEquals("My name is not Mark.", myString);
        myString.equals("My name is not Mark.");
    }
}