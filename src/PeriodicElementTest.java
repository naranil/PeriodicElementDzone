import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by anilnarassiguin on 09/08/16.
 */
public class PeriodicElementTest {

    @Test
    public void test1() {
        PeriodicElement e1 = new PeriodicElement("Spenglerium");
        String s1 = "Ee";
        assertTrue(e1.checkSymbol(s1));

    }

    @Test
    public void test2() {
        PeriodicElement e2 = new PeriodicElement("Zeddemorium");
        String s2 = "Zr";
        assertTrue(e2.checkSymbol(s2));

    }

    @Test
    public void test3() {
        PeriodicElement e3 = new PeriodicElement("Venkmine");
        String s3 = "Kn";
        assertTrue(e3.checkSymbol(s3));

    }

    @Test
    public void test4() {
        PeriodicElement e4 = new PeriodicElement("Stantzon");
        String s4 = "Zt";
        assertFalse(e4.checkSymbol(s4));

    }

    @Test
    public void test5() {
        PeriodicElement e5 = new PeriodicElement("Melintzum");
        String s5 = "Nn";
        assertFalse(e5.checkSymbol(s5));
    }

    @Test
    public void test6() {
        PeriodicElement e6 = new PeriodicElement("Tullium");
        String s6 = "Ty";
        assertFalse(e6.checkSymbol(s6));
    }

}