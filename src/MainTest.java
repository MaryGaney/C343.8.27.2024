import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    //putting extra tests here
    @Test
    void testAdd(){
        assertEquals(5, Main.add(2,3));
        //will not work for if b is negative then it will continue to decrease as a negative number
        //if a is negative it will work just fine
        assertEquals(3, Main.add(4,-1));
    }

    //works for a bit, but then gets to very large numbers
    //int primitive type restricted to 32 bits, get to max number and starts over and dips into negative numbers
    //
    @Test
    void testFactorial(){
        assertEquals(120,Main.factorial(5));
        assertEquals(1,Main.factorial(0));
        //assertTrue(Main.factorial(45)>0);
    }
}