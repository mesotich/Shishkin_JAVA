package tests;

import main.Parentheses;
import org.junit.Assert;
import org.junit.Test;

public class SimpleTests {

    @Test
    public void testSimple1() {
        boolean actual = Parentheses.isValid("[((())()(())]]");
        Assert.assertFalse(actual);
    }

    @Test
    public void testSimple2() {
        boolean actual = Parentheses.isValid("([([])])");
        Assert.assertTrue(actual);
    }
}

