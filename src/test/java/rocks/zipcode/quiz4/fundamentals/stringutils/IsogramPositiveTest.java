package rocks.zipcode.quiz4.fundamentals.stringutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quiz4.fundamentals.StringUtils;

public class IsogramPositiveTest {
    @Test
    public void test1() {
        String input = "Lump";
        Assert.assertTrue(StringUtils.isIsogram(input));
    }

    @Test
    public void test2() {
        String input = "Lj";
        Assert.assertTrue(StringUtils.isIsogram(input));
    }

    @Test
    public void test3() {
        String input = "Lj0Oo";
        Assert.assertTrue(StringUtils.isIsogram(input));
    }


    @Test
    public void test4() {
        String input = "Lhe Quick";
        Assert.assertTrue(StringUtils.isIsogram(input));
    }

    @Test
    public void test5() {
        String input = "Lrown";
        Assert.assertTrue(StringUtils.isIsogram(input));
    }




}
