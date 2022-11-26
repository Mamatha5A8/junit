package acoecse1.cseb5a81;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test()
    {
    	App a=new App();
    	int actual=a.add(10,10);
    	int expected=20;
    	assertEquals(expected,actual);
    }
}

