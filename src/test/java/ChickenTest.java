/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;

public class ChickenTest {
    Chicken c = new Chicken();

    @Before
    public void setUp() throws Exception {
        c = new Chicken();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Cluck Cluck!", c.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(5, c.getPrice());
    }
}
