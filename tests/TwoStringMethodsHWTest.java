import org.junit.Test;

import static org.junit.Assert.*;

public class TwoStringMethodsHWTest {

    @Test
    public void abcTest1() {
        boolean result = TwoStringMethodsHW.abcTest("123abc");
        assertEquals(true, result);

    }
    @Test
    public void abcTest2() {
        boolean result = TwoStringMethodsHW.abcTest("123.abc");
        assertEquals(false, result);

    }
    @Test

    public void abcTest3() {
        boolean result = TwoStringMethodsHW.abcTest("abc.123");
        assertEquals(true, result);

    }
    @Test
    public void abcTest4() {
        boolean result = TwoStringMethodsHW.abcTest("");
        assertEquals(false, result);

    }

    @Test
    public void alternateStrings1() {
        String result = TwoStringMethodsHW.alternateStrings("abc", "xyz");
        assertEquals("axbycz", result);
    }
    @Test
    public void alternateStrings2() {
        String result = TwoStringMethodsHW.alternateStrings("Hi", "There");
        assertEquals("HTihere", result);
    }@Test
    public void alternateStrings3() {
        String result = TwoStringMethodsHW.alternateStrings("xxxx", "Thereee");
        assertEquals("xTxhxexreee", result);
    }@Test
    public void alternateStrings4() {
        String result = TwoStringMethodsHW.alternateStrings("Thereee", "xxxx");
        assertEquals("Txhxexrxeee", result);
    }

}