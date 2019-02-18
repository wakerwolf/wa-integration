// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 3; page ??
// JUnit for Calc.java

import org.junit.*;
import static org.junit.Assert.*;

public class CalcTest
{
    @Test public void testAdd()
    {
        assertTrue ("Calc sum incorrect", 5 == Calc.add (3, 2));
    }

    @Test public void testMult()
    {
        assertTrue ("Calc multiplication incorrect", 8 == Calc.mult (2, 4));
    }

    @Test public void testDiv()
    {
        assertTrue ("Calc divition incorrect", 8 == Calc.div (32, 4));
    }

}

