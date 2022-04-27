import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class EH {
    private int x;
    public EH(int x) {
        this.x = x;
    }

    @Override public boolean equals(Object obj) {
        if (!(obj instanceof EH)) return false;
        return ((EH) obj).x == this.x;
    }

    @Override public int hashCode() { return x; }
}

class InClassTest {
    private EH eh1;
    private EH eh2;
    private EH eh3;

    //  Question 1 -  Given the 4 @Test methods shown, how many times does the @Before method execute?
    // Just one time, it will setup the environment for the class we want to test.*/

    @Before
    public void setUp() {
        eh1 = new EH(4);
        eh2 = new EH(6);
        eh3 = new EH(6);
    }

    //Question 2 - The contract for equals() states that no exceptions may be thrown.
    //Instead, equals() is supposed to return false if passed a null argument.
    //Write a JUnit test that verifies this property for the EH class.

    @Test public void noNPE() {
        assertEquals(false, eh1.equals(null));
        assertEquals(false, eh2.equals(null));
    }

    // Question 3 - Using the given EH objects, write a test that verifies that equals() returns false if the objects are, in fact, not equal.
    @Test public void equalsFalse() {
        assertEquals(false, eh1.equals(eh2));
        assertEquals(false, eh2.equals(eh3));
    }

    // Question 4 - Using the given EH objects, write a test that verifies that equals() returns true if the objects are, in fact, equal.

    @Test public void equalsTrue() {
        assertEquals(true, eh1.equals(eh1));
        assertEquals(true, eh2.equals(eh2));
        assertEquals(true, eh3.equals(eh3));
    }

    // Question 5 Using the given EH objects, write a test to verify that hashCode() is consistent with equals. This test should fail if hashCode() is commented out (as shown), but pass if hashCode() is implemented.

    @Test
    public void hashConsistent() {
        assertEquals(false, eh1.hashCode() == eh2.hashCode());
        assertEquals(true, eh2.hashCode() == eh2.hashCode());
        assertEquals(true, eh3.hashCode() == eh1.hashCode());
    }
}


