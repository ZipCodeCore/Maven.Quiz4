package rocks.zipcode.quiz4.fundamentals.stringutils;

import org.junit.Assert;
import org.junit.Test;

import static rocks.zipcode.quiz4.fundamentals.StringUtils.invertCasing;

public class InvertCasingTest {
    @Test
    public void test0() {
        String input = "A";
        String expected = "a";
        Assert.assertEquals(expected, invertCasing(input));
    }

    @Test
    public void test1() {
        String input = "z";
        String expected = "Z";
        Assert.assertEquals(expected, invertCasing(input));
    }

    @Test
    public void test2() {
        String expected = "Blah Blah Blah";
        Assert.assertEquals(expected, invertCasing(invertCasing(expected)));

    }

    @Test
    public void test3() {
        String input = "InCrEaSiNg";
        String expected = "iNcReAsInG";
        Assert.assertEquals(expected, invertCasing(input));
    }

    @Test
    public void test4() {
        String input = "nO bIG dEAL!";
        String expected = "No Big Deal!";
        Assert.assertEquals(expected, invertCasing(input));
    }

    @Test
    public void test5() {
        String expected = "#^@!&*$    (%$";
        Assert.assertEquals(expected, invertCasing(expected));
    }
}
